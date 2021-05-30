package Lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 6种
 */
public class LambdaTest1 {
    //1
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

        Runnable r2 = () -> {System.out.println("我爱小蛮腰");}; //lambda操作符//箭头操作符

        r2.run();
    }

    //2
    @Test
    public void test2(){
        Consumer<String> con1 = (String s) -> {System.out.println(s);};
    }

    //3 类型推断
    @Test
    public void test3(){
        Consumer<String> con2 = ( s) -> {System.out.println(s);}; //左边一定要写，右边可以不写
    }

    //4 参数只有一个，括号可以省略
    @Test
    public void test4(){
        Consumer<String> con2 = s -> {System.out.println(s);}; //左边一定要写，右边可以不写
    }

    //5
    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("*****");
        Comparator<Integer> com2 = (o1,o2)-> {
            System.out.println(1);
            System.out.println(2);
            return o1.compareTo(o2);
        };
    }

    //6 lamda体只有一条语句，并且有return和返回值，都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com1 = (o1,o2) -> o1.compareTo(o2);
    }
}
