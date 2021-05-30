package Hello;

public class SingletonTest {
    public static void main(String[] args){
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1 == o2);
        SingletonTest t = new SingletonTest();
        t.show();

    }
    public void show(){}
    static {
        System.out.println("hello");
    }
    {
        System.out.println("world");
    }
}
//饿汉式
 class  Bank1 {

    //私有化类的构造器
    private Bank1(){

    }



    //内部创建类的对象,static
    private  static Bank1 instance = new Bank1();//饿的时候提前造

    //提供公共方法，返回类的对象

    public static Bank1 getInstance() {
        return instance;
    }
}

//饱汉式
class Order{
    private Order(){}

    //声明类对象，没有初始化,static
    private static Order instance = null; //啥时候用啥时候造

    public static Order getInstance(){
        if(instance==null)
            instance = new Order();
        return instance;
    }
}
//区分
/*

饿汉式：坏处，对象加载慢
        好处，线程安全


懒汉式：好处，延迟对象的创建
目前写法，线程不安全


 */
