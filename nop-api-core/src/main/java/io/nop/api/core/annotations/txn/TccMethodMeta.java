/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.api.core.annotations.txn;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.nop.api.core.annotations.data.DataBean;
import io.nop.api.core.annotations.data.ImmutableBean;

import java.io.Serializable;

@ImmutableBean
@DataBean
public class TccMethodMeta implements Serializable {
    private final String txnGroup;
    private final String confirmMethod;
    private final String cancelMethod;

    public TccMethodMeta(@JsonProperty("txnGroup") String txnGroup,
                         @JsonProperty("confirmMethod") String confirmMethod,
                         @JsonProperty("cancelMethod") String cancelMethod) {
        this.txnGroup = txnGroup;
        this.confirmMethod = confirmMethod;
        this.cancelMethod = cancelMethod;
    }

    public String getTxnGroup() {
        return txnGroup;
    }

    public String getConfirmMethod() {
        return confirmMethod;
    }

    public String getCancelMethod() {
        return cancelMethod;
    }
}