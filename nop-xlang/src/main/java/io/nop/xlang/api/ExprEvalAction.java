/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.xlang.api;

import io.nop.api.core.annotations.data.ImmutableBean;
import io.nop.api.core.json.IJsonString;
import io.nop.api.core.util.ISourceLocationGetter;
import io.nop.api.core.util.SourceLocation;
import io.nop.core.context.IEvalContext;
import io.nop.core.lang.eval.IExecutableExpression;

@ImmutableBean
public class ExprEvalAction extends AbstractEvalAction implements ISourceLocationGetter, IJsonString {
    private final IExecutableExpression expr;

    public ExprEvalAction(IExecutableExpression expr) {
        this.expr = expr;
    }

    public String toString() {
        return expr.toString();
    }

    public IExecutableExpression getExpr() {
        return expr;
    }

    public XplModel toXplModel() {
        return new XplModel(expr);
    }

    @Override
    public SourceLocation getLocation() {
        return expr.getLocation();
    }

    @Override
    public Object invoke(IEvalContext ctx) {
        return XLang.execute(expr, ctx.getEvalScope());
    }
}
