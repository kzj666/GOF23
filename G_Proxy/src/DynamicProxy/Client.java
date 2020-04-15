package DynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        //真实角色
        Rent host = new Host();

        //传入要代理的对象实例
        ProxyInvocationHandler handler = new ProxyInvocationHandler(host);

        //Proxy.newProxyInstance()方法，生成动态代理类的一个实例
        Rent proxy = (Rent) Proxy.newProxyInstance(host.getClass().getClassLoader(), host.getClass().getInterfaces(), handler);

        proxy.rent();


        String a = new String("aa");
        String b = new String("aa");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }
}