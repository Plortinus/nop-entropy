/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.xlang.exec;

import io.nop.api.core.ApiErrors;
import io.nop.api.core.convert.ConvertHelper;
import io.nop.api.core.convert.ITypeConverter;
import io.nop.api.core.util.SourceLocation;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.core.lang.eval.IExecutableExpression;
import io.nop.core.lang.eval.IExpressionExecutor;
import io.nop.core.reflect.ReflectionManager;

public class CastExecutable extends AbstractExecutable {
    private final IExecutableExpression expr;
    private final Class<?> clazz;
    private final ITypeConverter converter;
    private final Object defaultValue;

    public CastExecutable(SourceLocation loc, IExecutableExpression expr, Class<?> clazz) {
        super(loc);
        this.expr = expr;
        this.clazz = clazz;
        this.defaultValue = ConvertHelper.getDefault(clazz);
        this.converter = ReflectionManager.instance().getConverterForJavaType(clazz);
    }

    @Override
    public boolean allowBreakPoint() {
        return false;
    }

    @Override
    public void display(StringBuilder sb) {
        expr.display(sb);
        sb.append(" as ");
        sb.append(clazz.getTypeName());
    }

    @Override
    public Object execute(IExpressionExecutor executor, IEvalScope scope) {
        Object value = executor.execute(expr, scope);
        if (value == null)
            return defaultValue;

        Object converted = converter.convertEx(scope, value, this::newError);
        if (converted != null) {
            // 总是校验一下，避免converter不准确
            if (!clazz.isInstance(value))
                throw newError(ApiErrors.ERR_CONVERT_TO_TYPE_FAIL).param(ApiErrors.ARG_VALUE, value)
                        .param(ApiErrors.ARG_SRC_TYPE, value.getClass().getTypeName())
                        .param(ApiErrors.ARG_TARGET_TYPE, clazz.getTypeName());
        }
        return converted;
    }
}