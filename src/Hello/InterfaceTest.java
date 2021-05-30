package Hello;
//在java中，接口和类是并列的两个结构
//JDK7：
/*
全局常量 public static final
抽象方法

接口不能实例化
java中，接口通过让类去实现（implement）的方式来使用
 */


public class InterfaceTest {
    public static void main(String[] args){

    }
}

interface Flyable{
    public static final int MAX_SPEED = 7900;
    void eat();
    public abstract int sleep();
}

abstract class  A implements Flyable {
    @Override
    public int sleep(){
            System.out.println("23");
        return 0;
    }

    }