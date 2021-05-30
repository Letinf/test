package GenericTest;

import org.junit.Test;

import javax.print.attribute.standard.OrientationRequested;
import java.security.spec.DSAGenParameterSpec;
import java.util.*;

public class Generictest {

    /**
     * 在集合中，不能使用基本数据类型，只能用包装类
     */
    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //编译时候会进行类型安全检查

        list.add(78);
        for (Integer sore : list) {
            System.out.println(sore);
        }
    }

    @Test
    public void test2() {
        //map 的 K\V都是泛型
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("tom", 87);

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();


    }

    /**
     * 自定义泛型类、泛型方法、泛型方法
     */
    @Test
    public void test3() {

        //如果定义了泛型类，但是实例化没有指明，那么类型默认为object类
        Order order = new Order();
        order.setOrderId(123);
        order.setOrderT("ssd");

        //建议
        Order<String> order1 = new Order<String>();
        order1.setOrderT("sd");

    }

    //    /**
//     * 泛型方法参数和类的泛型参数要不同，即泛型方法所在的类是不是泛型类都可以
//     * @param arr
//     * @param <E>
//     * @return
//     */
//    public <E> List<E> copyList(E[] arr) {
//        ArrayList<E> list = new ArrayList<>();
//        for (E e : arr) {
//            list.add(e);
//
//        }
//        return list;
//    }
    @Test
    public void test4() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        //泛型方法调用时候使用类型
        List<Integer> list = order.copyList(arr);
    }
}
