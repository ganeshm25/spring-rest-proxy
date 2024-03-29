package com.yangtaishou.util.rest.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * User: yangkuan@jd.com
 * Date: 15-1-30
 * Time: 下午5:55
 */
public class InvocationHandlerImpl<T> implements InvocationHandler {
    private Map<Method, HttpClientInvoker> methodMap;
    private Class<T> t;

    public InvocationHandlerImpl(Class<T> t, Map<Method, HttpClientInvoker> methodMap) {
        this.t = t;
        this.methodMap = methodMap;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (methodMap.get(method) != null) {
            if (args != null && args.length > 0) {
                Object obj = methodMap.get(method).invoke(args[0]);
                return obj;
            } else {
                Object obj = methodMap.get(method).invoke(null);
                return obj;
            }
        }
        return null;
    }
}
