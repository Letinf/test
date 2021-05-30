package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ThreadPool {
    public static void main(String[] args){
        //1、提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor ser = (ThreadPoolExecutor)service;
        ser.setCorePoolSize(15);
        ser.setKeepAliveTime(1000, TimeUnit.SECONDS);

        //2、执行线程操作。需要提供实现runnable接口或callable接口实现类的对象
        service.execute(new NumberThread()); //适合用在Runnable
        //service.submit(new NumberThread1()); // 适合使用于callable
        service.execute(new NumberThread1());

        service.shutdown();
    }
}

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+ i);
            }
        }
    }
}

class NumberThread1 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":"+ i);
            }
        }
    }
}
