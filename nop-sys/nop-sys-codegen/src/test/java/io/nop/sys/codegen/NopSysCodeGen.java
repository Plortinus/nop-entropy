/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.sys.codegen;

import io.nop.api.core.config.AppConfig;
import io.nop.codegen.XCodeGenerator;
import io.nop.commons.util.MavenDirHelper;
import io.nop.core.CoreConfigs;
import io.nop.core.CoreConstants;
import io.nop.core.initialize.CoreInitialization;

import java.io.File;

// 辅助调试所生成的临时代码
public class NopSysCodeGen {
    public static void main(String[] args) {
        AppConfig.getConfigProvider().updateConfigValue(CoreConfigs.CFG_CORE_MAX_INITIALIZE_LEVEL, CoreConstants.INITIALIZER_PRIORITY_ANALYZE);

        CoreInitialization.initialize();
        try {
            File projectDir = MavenDirHelper.projectDir(NopSysCodeGen.class);
            XCodeGenerator.runPostcompile(projectDir, "/", false);
        } finally {
            CoreInitialization.destroy();
        }
    }
}
