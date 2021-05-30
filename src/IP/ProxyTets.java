package IP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
interface human{
    String getBelief();

    void eat(String food);
}

//被代理类
class superman implements human{

    @Override
    public String getBelief() {
        return "i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println(food);
    }
}

//动态代理中唯一的通用代理类
class ProxyFactory{
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        myInvocationHandler handler = new myInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class myInvocationHandler implements InvocationHandler{

    private Object obj;



    public void bind(Object obj) {
        this.obj = obj;
    }

    //当我们通过代理类的对象，调用a方法时，就会自动调用以下的方法：invoke()
    //将被代理类要执行的方法a的功能声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnhander = method.invoke(obj,args);
        return returnhander;
    }
}

public class ProxyTets {
    public static void main(String[] args){
        superman superman = new superman();

        human pro = (human) ProxyFactory.getProxyInstance(superman);
        String belief = pro.getBelief();
        System.out.println(belief);
        pro.eat("麻辣烫");

        NIkeClothFactory nIkeClothFactory = new NIkeClothFactory();
        ClothFactory pro1 = (ClothFactory) ProxyFactory.getProxyInstance(nIkeClothFactory);
        pro1.produceCloth();

    }
}
