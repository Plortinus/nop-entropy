/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.web.page;

import io.nop.api.core.exceptions.NopException;
import io.nop.api.core.util.SourceLocation;
import io.nop.commons.text.MutableString;
import io.nop.commons.text.tokenizer.SimpleTextReader;
import io.nop.commons.util.StringHelper;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.core.lang.xml.XNode;
import io.nop.core.lang.xml.parse.XNodeParser;
import io.nop.web.WebConstants;
import io.nop.xlang.api.XLang;
import io.nop.xlang.api.XLangCompileTool;
import io.nop.xlang.ast.XLangOutputMode;

import static io.nop.web.WebErrors.ARG_LOC;
import static io.nop.web.WebErrors.ERR_WEB_JS_COMMENT_NOT_END_PROPERLY;

public class XGenJsProcessor {
    public String process(SourceLocation loc, String text) {
        MutableString ret = new MutableString();

        SimpleTextReader tokenizer = new SimpleTextReader(loc, text);
        do {
            tokenizer.skipBlank();
            if (tokenizer.startsWith("//")) {
                tokenizer.skipLine();
                continue;
            }
            if (tokenizer.startsWith("/*")) {
                tokenizer.move(2);
                SourceLocation genLoc = tokenizer.location();
                int end = tokenizer.find("*/");
                if (end < 0)
                    throw new NopException(ERR_WEB_JS_COMMENT_NOT_END_PROPERLY)
                            .param(ARG_LOC, genLoc);

                // 动态生成js文件内容
                if (tokenizer.tryMatch(WebConstants.PREFIX_X_GEN_EXTENDS)) {
                    int pos = tokenizer.pos();
                    String genSource = tokenizer.substring(pos, end);
                    String genJs = genJs(loc, genSource);
                    ret.append(genJs).append('\n');
                }
                tokenizer.moveTo(end + 2);
            } else {
                ret.append(tokenizer.readLine());
                ret.append('\n');
            }
        } while (!tokenizer.isEnd());

        return ret.trim().toString();
    }

    private String genJs(SourceLocation loc, String genSource) {
        if (StringHelper.isBlank(genSource))
            return "";
        XNode node = XNodeParser.instance().parseFromText(loc, genSource);
        XLangCompileTool cp = XLang.newCompileTool();
        IEvalScope scope = XLang.newEvalScope();
        return cp.compileTagBody(node, XLangOutputMode.text).generateText(scope);
    }
}
