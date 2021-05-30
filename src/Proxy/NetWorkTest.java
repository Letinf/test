package Proxy;
/*
接口的应用

代理模式：不改变源代码基础上，增强功能
 */

public class NetWorkTest {
    public static void main(String[] args){
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse(); //调用了代理类的方法 ，但run结果是server在跑
    }
}
interface NetWork{
    public void browse();
}
//被代理类
class Server implements NetWork{ // 人家写好的代码，不改变，连上接口得到sever的实现类，最后把该实现类当成实参传入代理类

    @Override
    public void browse() {
        System.out.println("真实的服务器网络");
    }
}
//代理类
class ProxyServer implements NetWork{

    private NetWork work;//可以使用接口声明对象,但必须使用其实现类实例化!!!

    public ProxyServer(NetWork work){ //构造器    接口为行参，但是具体实现类为实参，任何调用实现该接口的子类都可以传入来
        this.work = work;
    }

    public void check(){
        System.out.println("检查工作");  //这是代理类新扩展的功能
    }

    @Override
    public void browse() {
        check();//新扩展的
        work.browse();//源代码

    }
}