package dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {

    private Object obj;

    public JdkProxy(Object e) {
        obj = e;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object o = method.invoke(obj, args);
        System.out.println("after");
        return o;
    }
}
