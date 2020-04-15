package StaticProxy;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东租房子，但是代理角色会有一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}