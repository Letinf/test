package Thread;

/**
 * 2、同步方法
 *  同步方法的监视器不需要显示声明
 *  非静态的同步方法，监视器是this
 *  非静态的方法，监视器是当前类本身
 *
 */

public class WindowsTest3{
    public static void main(String[] args){
        windows3 w = new windows3();

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
class windows3 implements Runnable{
    private  int ticket = 100;
    Object obj = new Object();
    //private static Object obj = new Object();   继承的方式天然不是共享的，实现接口的方式天然是共享的

    @Override
    public synchronized void run() { //this
        while (true) {
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