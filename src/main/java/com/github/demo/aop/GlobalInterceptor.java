package com.github.demo.aop;

import com.github.jsoncat.core.aop.intercept.Interceptor;
import com.github.jsoncat.core.aop.intercept.MethodInvocation;

/**
 * @author shuang.kou
 * @createTime 2020Äê10ÔÂ09ÈÕ 21:28:00
 **/
public class GlobalInterceptor extends Interceptor {
    @Override
    public Object intercept(MethodInvocation methodInvocation) {
        System.out.println(GlobalInterceptor.class.getSimpleName() + " before method£º" + methodInvocation.getTargetMethod().getName());
        Object result = methodInvocation.proceed();
        System.out.println(GlobalInterceptor.class.getSimpleName() + " after method£º" + methodInvocation.getTargetMethod().getName());
        return result;
    }
}
