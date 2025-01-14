/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.integration.api.sms;

import java.util.List;

public interface ISmsSender {
    void sendMessage(SmsMessage message);

    default void sendMultiMessage(List<SmsMessage> messages) {
        for (SmsMessage message : messages) {
            sendMessage(message);
        }
    }
}
