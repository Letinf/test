package Thread;

/** 1 、 同步代码块
 * synchronized(同步监视器){
 *     //需要被同步的代码 --- 操作共享数据的代码
 * }
 * 说明：同步监视器，即锁。任何类的对象都可以当锁
 * 要求多个线程共用一把锁
 *
 *
 * 2、同步方法
 *
 *
 */

public class WindowsTest1 {
public static void main(String[] args){
    windows1 w = new windows1();

    Thread t1 = new Thread(w);
    Thread t2 = new Thread(w);
    Thread t3 = new Thread(w);
    t1.setName("窗口1");
    t2.setName("窗口2");
    t3.setName("窗口3");

    t1.start();
    t2.start();
    t3.start();
}
}
class windows1 implements Runnable{
    private  int ticket = 100;
    Object obj = new Object();
    //private static Object obj = new Object();   继承的方式天然不是共享的，实现接口的方式天然是共享的

    @Override
    public void run() {
        //Object obj = new Object();
        while (true) {
            //synchronized (this) {  //当前windows1的对象只有一个，即 W
            synchronized (windows1.class){ //类也是对象！！类只会加载一次
                if (ticket > 0) {

                    try {
                        Thread.sleep(10);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票,票号为：" + ticket--);
                } else
                    break;

            }
        }
    }
}