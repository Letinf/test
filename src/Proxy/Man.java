package Proxy;

interface Filial {
    int a = 0;
    default void help(){
        System.out.println("救老妈");

    }

}

interface Spoony{
    default void help(){
        System.out.println("救媳妇");
    }
}
class Father{
    public void help(){
        System.out.println("听我的！");
    }
}

public class Man extends Father implements Spoony,Filial {
    @Override
    public void help() {

        System.out.println("我怎么办");

        Spoony.super.help();
        Filial.super.help();

    }
}