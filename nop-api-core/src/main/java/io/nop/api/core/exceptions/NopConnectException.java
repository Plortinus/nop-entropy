/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.api.core.exceptions;

public class NopConnectException extends NopException {

    public NopConnectException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public NopConnectException(ErrorCode errorCode) {
        super(errorCode);
    }

    public NopConnectException(String errorCode, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(errorCode, cause, enableSuppression, writableStackTrace);
    }
}
