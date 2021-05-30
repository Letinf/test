package IP;

/**
 * 静态代理：代理类和被代理类在编译期间就已经确定下来
 */
interface ClothFactory{
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;//用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() { //代理模式就是把被代理类方法包装起来，实质上还是用的被代理类方法
        System.out.println("准备");
        factory.produceCloth();
        System.out.println("结束");
    }
}

//被代理类
class NIkeClothFactory implements ClothFactory { // nike工厂有这个行为，就是生产衣服。只是把这个行为提炼出来变成接口！


    @Override
    public void produceCloth() {
        System.out.println("nike");
    }
}

public class StaticProxyTest {
    public static void main(String[] args){

        NIkeClothFactory nike = new NIkeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();


    }
}
