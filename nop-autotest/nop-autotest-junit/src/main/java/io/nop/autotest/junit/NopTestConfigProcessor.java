/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.autotest.junit;

import io.nop.api.core.ApiConfigs;
import io.nop.api.core.annotations.autotest.NopTestConfig;
import io.nop.api.core.convert.ConvertHelper;
import io.nop.api.core.time.CoreMetrics;
import io.nop.autotest.core.util.TestClock;
import io.nop.commons.util.StringHelper;
import io.nop.core.resource.ResourceHelper;
import io.nop.core.resource.impl.ClassPathResource;
import io.nop.dao.DaoConfigs;

import java.util.Properties;

import static io.nop.autotest.core.AutoTestConfigs.CFG_AUTOTEST_DISABLE_SNAPSHOT;
import static io.nop.core.unittest.BaseTestCase.setTestConfig;
import static io.nop.ioc.IocConfigs.CFG_IOC_APP_BEANS_CONTAINER_START_MODE;
import static io.nop.ioc.IocConfigs.CFG_IOC_APP_BEANS_FILES;
import static io.nop.ioc.IocConfigs.CFG_IOC_APP_BEANS_FILE_ENABLED;
import static io.nop.ioc.IocConfigs.CFG_IOC_APP_BEANS_FILE_PATTERN;
import static io.nop.ioc.IocConfigs.CFG_IOC_APP_BEANS_FILE_SKIP_PATTERN;
import static io.nop.ioc.IocConfigs.CFG_IOC_AUTO_CONFIG_ENABLED;
import static io.nop.ioc.IocConfigs.CFG_IOC_AUTO_CONFIG_PATTERN;
import static io.nop.ioc.IocConfigs.CFG_IOC_AUTO_CONFIG_SKIP_PATTERN;
import static io.nop.ioc.IocConfigs.CFG_IOC_MERGED_BEANS_FILE_ENABLED;
import static io.nop.orm.OrmConfigs.CFG_INIT_DATABASE_SCHEMA;

public class NopTestConfigProcessor {

    public void process(NopTestConfig config) {
        if(config.useTestClock()){
            CoreMetrics.registerClock(new TestClock());
        }
        if (config.localDb()) {
            setTestConfig(DaoConfigs.CFG_DATASOURCE_DRIVER_CLASS_NAME, "org.h2.Driver");
            setTestConfig(DaoConfigs.CFG_DATASOURCE_USERNAME, "sa");
            setTestConfig(DaoConfigs.CFG_DATASOURCE_PASSWORD, "");
            setTestConfig(DaoConfigs.CFG_DATASOURCE_JDBC_URL, "jdbc:h2:mem:" + StringHelper.generateUUID());
        }

        if(config.disableSnapshot()){
            setTestConfig(CFG_AUTOTEST_DISABLE_SNAPSHOT,true);
        }

        setTestConfig(CFG_IOC_APP_BEANS_CONTAINER_START_MODE, config.beanContainerStartMode().name());

        if (!config.testConfigFile().isEmpty()) {
            ClassPathResource resource = new ClassPathResource(config.testConfigFile());
            Properties props = ResourceHelper.readProperties(resource);
            for (Object name : props.keySet()) {
                setTestConfig((String) name, props.get(name));
            }
        }

        setTestConfig(CFG_IOC_AUTO_CONFIG_ENABLED, config.enableAutoConfig());
        if (!config.autoConfigPattern().isEmpty()) {
            setTestConfig(CFG_IOC_AUTO_CONFIG_PATTERN, config.autoConfigPattern());
        }
        if (!config.autoConfigSkipPattern().isEmpty()) {
            setTestConfig(CFG_IOC_AUTO_CONFIG_SKIP_PATTERN, config.autoConfigSkipPattern());
        }

        setTestConfig(CFG_IOC_MERGED_BEANS_FILE_ENABLED, config.enableMergedBeansFile());

        setTestConfig(CFG_IOC_APP_BEANS_FILE_ENABLED, config.enableAppBeansFile());
        if (!config.appBeansFilePattern().isEmpty()) {
            setTestConfig(CFG_IOC_APP_BEANS_FILE_PATTERN, config.appBeansFilePattern());
        }
        if (!config.appBeansFileSkipPattern().isEmpty()) {
            setTestConfig(CFG_IOC_APP_BEANS_FILE_SKIP_PATTERN, config.appBeansFileSkipPattern());
        }

        if (!config.testBeansFile().isEmpty()) {
            setTestConfig(CFG_IOC_APP_BEANS_FILES, config.testBeansFile());
        }

        setTestConfig(CFG_INIT_DATABASE_SCHEMA, config.initDatabaseSchema());

        if (!config.enableActionAuth().isEmpty()) {
            setTestConfig(ApiConfigs.CFG_AUTH_ENABLE_ACTION_AUTH, ConvertHelper.toBoolean(config.enableActionAuth()));
        }

        if (!config.enableDataAuth().isEmpty()) {
            setTestConfig(ApiConfigs.CFG_AUTH_ENABLE_DATA_AUTH, ConvertHelper.toBoolean(config.enableDataAuth()));
        }
    }
}
