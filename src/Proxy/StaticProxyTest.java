package Proxy;

import javax.print.DocFlavor;
import java.sql.Statement;

public class StaticProxyTest {
    public static void main(String[] args){
        Proxy s = new Proxy(new RealStar());
        s.confer();
        s.signContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();

    }
}
interface star{
    void confer();
    void signContract();
    void bookTicket();
    void sing();
    void collectMoney();

}

class RealStar implements star{

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("歌手在唱歌");
    }

    @Override
    public void collectMoney() {

    }
}
class Proxy implements star{
    public Proxy(star real) {
        this.real = real;
    }

    private star real;


    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {  //除了这个其他都是新扩展的
        real.sing();

    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}