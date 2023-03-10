/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.core.resource;

import java.sql.Timestamp;
import java.util.function.Function;

public interface IResourceHistory {
    boolean changeResource(IResource resource, Function<IResource, Boolean> task);

    void rollback(IResource resource, Timestamp fileTime);
}