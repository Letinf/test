package Rock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现callable接口
 *
 * 1、创建一个实现Callable的实现类
 * 2、实现call方法
 * 3、创建callabele接口实现类的对象
 * 4、将此callable接口实现类的对象作为形参传递到FutureTask构造器中，创建FutureTask的对象
 * 5、将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
 * 6、获取返回值--get
 */

public class ThreadNew {
    public static void main(String[] args){
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get(); //返回值为重写的call（）返回值
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class NumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}