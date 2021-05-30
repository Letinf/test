package Lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * 格式：
 *  -> : lambda操作符
 *  -> 左边： lambda形参列表（接口中抽象方法的形参列表）
 *  -> 右边： lambda体（重写的抽象方法的方法体）
 */
public class LambdaTest {

    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱中山大学");
            }
        };
        r1.run();

        System.out.println("*************");

        Runnable r2 = () -> System.out.println("我爱小蛮腰"); //lambda操作符//箭头操作符

        r2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12,21));
        System.out.println("*************");
        //lambda
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com2.compare(12,21));

        System.out.println("*************");
        //方法引用
        Comparator<Integer> com3 = Integer ::compare; // ：：方法引用
        System.out.println(com2.compare(12,21));
    }
}
