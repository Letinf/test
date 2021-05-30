package Thread;

/**
 * 多线程创建方式一：继承于Thread类
 * 1、创建一个继承于Thread的子类
 * 2、重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3、创建Thread类的子类的对象
 * 4、通过对象来调用start()方法 :启动线程、调用run
 */
public class ThreadTest {
    public static void main(String[] args){
        MyThread t1 = new MyThread();

        //创建Thread类的匿名子类形式
        new Thread(){
            int i; //default  0
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(;i<50;i++) {

                    System.out.println("###");
                }

            }
        }.start();

        t1.start();
        //t1.run()   #不行的，没有新开线程

        for (int i =0 ;i<100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(Thread.currentThread().getName());
            }
        }
        System.out.println(t1.isAlive());
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i =0 ;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i + ""+ Thread.currentThread().getName());
            }
        }
    }
}
