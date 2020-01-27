package com.alibaba.cola.test.customer.interceptor;

import com.alibaba.cola.executor.ExecutorInterceptorI;
import com.alibaba.cola.executor.PreInterceptor;
import com.alibaba.cola.dto.Command;

/**
 * ContextInterceptor
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:21 AM
 */
@PreInterceptor
public class ContextInterceptor  implements ExecutorInterceptorI {

    @Override
    public void preIntercept(Command command) {
        // TenantContext.set(Constants.TENANT_ID, Constants.BIZ_1);
    }
}
