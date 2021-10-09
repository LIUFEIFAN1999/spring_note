package factory;

import domain.Animal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanFactory {
    Object target;

    public ProxyBeanFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before " +target.getClass().getName().substring(7)+" eating");
                Object returnValue = method.invoke(target, args);
                System.out.println("after " +target.getClass().getName().substring(7)+" eating");
                return returnValue;
            }
        });
    }
}
