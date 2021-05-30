package Thread;

import java.awt.*;

/**
 * 存在线程安全问题
 */
public class WindowsThread {
    public static void main(String[] args){
        windows t1 = new windows();
        windows t2 = new windows();
        windows t3 = new windows();

        t1.start();
        t2.start();
        t3.start();
    }

}

class windows extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if(ticket>0){
                System.out.println(getName()+"卖票：票号"+ticket--);
            }else
                break;
        }
    }
}
