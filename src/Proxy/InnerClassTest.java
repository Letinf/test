package Proxy;

public class InnerClassTest {
    public Comparable getComparable(){
        class MyComparable implements Comparable{
    //创建一个实现Com接口的类；局部内部类
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }

}
