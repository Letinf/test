package Thread;

import java.util.FormatFlagsConversionMismatchException;

/**
 * 创建多线程方式二：实现runnable接口
 * 1、创建一个实现了runnable接口的类
 * 2、实现类去实现runnable中的抽象方法：run()
 * 3、创建实现类的对象
 * 4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5、通过Thread类的对象调用start()
 *
 */

class Mthread implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args){
        Mthread m = new Mthread();
        Thread t1 = new Thread(m);
        t1.setName("线程1");
        t1.start();

        Mthread n = new Mthread();
        Thread t2 = new Thread(n);
        t2.setName("线程2");
        t2.start();
    }
}
