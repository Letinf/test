package Proxy;

public interface CompareObject {
    public int compare(Object o); //抽象方法在实现类里面一定要全部实现or实现类为abstract
    //返回值0表示相等，正数为比当前对象大
    public static void m(){}//1

    public default void def(){
        System.out.println("sdsd");
    }//2
}
//1 静态方法: 只供接口本身使用，子类和实现类都无法拿到！！
//2 缺省（默认）方法: 通过实现类的对象，可以调用接口中的默认方法
   // 如果实现类重写了方法，调用时，仍然调用的是重写以后的
/*
如果子类或实现类继承的父类和实现的接口中声明了同名同参数的方法，那么子类在没有重写的情况下，默认调用的是父类的方法

 如果多继承了好几个接口，并且有同名同参数的默认方法，没有重写就会报错

 */