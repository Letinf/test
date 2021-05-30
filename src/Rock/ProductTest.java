package Rock;

public class ProductTest {
    public static void main(String[] args){
        Clerk clerk = new Clerk();

        Productor p1 = new Productor(clerk);
        Comsumer p2 = new Comsumer(clerk);
        p1.setName("P1");
        p2.setName("C1");

        p1.start();
        p2.start();
    }
}

class Clerk{

    private int productCount = 0;

    public synchronized void produceProduct() throws InterruptedException {
        if (productCount < 20) {
            productCount++;

            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productCount + "个产品");
            notify();
        } else {
            wait();
        }
    }

    public synchronized void consumerProduct() throws InterruptedException {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productCount + "个产品");
            productCount--;
            notify();
        } else {
            wait();
        }
    }
}

class Productor extends Thread{

    private Clerk clerk;


    public Productor(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始生产产品......");
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                clerk.produceProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Comsumer extends Thread{

    private Clerk clerk;

    public  Comsumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始消费产品......");
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                clerk.consumerProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}