/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.xlang.xpl.tags;

import io.nop.core.lang.xml.XNode;
import io.nop.xlang.api.IXLangCompileScope;
import io.nop.xlang.ast.ContinueStatement;
import io.nop.xlang.ast.Expression;
import io.nop.xlang.xpl.IXplCompiler;
import io.nop.xlang.xpl.IXplTagCompiler;

import static io.nop.xlang.xpl.utils.XplParseHelper.checkNoArgNames;

public class ContinueTagCompiler implements IXplTagCompiler {
    public static final ContinueTagCompiler INSTANCE = new ContinueTagCompiler();

    @Override
    public Expression parseTag(XNode node, IXplCompiler cp, IXLangCompileScope scope) {
        checkNoArgNames(node);
        return ContinueStatement.valueOf(node.getLocation());
    }
}