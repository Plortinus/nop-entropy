/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.xlang.exec;

import io.nop.api.core.util.SourceLocation;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.core.lang.eval.IExpressionExecutor;

/**
 * 返回函数调用处的源码位置
 */
public class LocationFunction extends AbstractExecutable {
    public LocationFunction(SourceLocation loc) {
        super(loc);
    }

    @Override
    public Object execute(IExpressionExecutor executor, IEvalScope scope) {
        return getLocation();
    }

    @Override
    public void display(StringBuilder sb) {
        sb.append("location()");
    }
}
