/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.commons.text.tokenizer;

public interface IToken {
    default boolean isOperator(){
        return false;
    }

    default boolean isIdentifier(){
        return false;
    }

    String getText();
}
