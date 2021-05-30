package Lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;


/**
 * 方法引用：本质就是lambda表达式，也是函数式接口的实例
 *
 * 类（或者对象） ：： 方法名
 * 1 对象 ：：非静态方法
 * 2 类 ：： 静态‘
 * 3 类 ：： 非静态
 */
public class MethodRefTest {
    @Test
    public void test1(){
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");


        //consumer() 和 println()参数一样

        PrintStream ps = System.out;

        Consumer<String> con2 = ps ::println;  //方法引用参数都可以省略
        con2.accept("广州");


    }

    @Test
    public void test2(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

    }


}
