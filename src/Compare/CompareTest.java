package Compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * comparable接口
 *
 */

public class CompareTest {
    /**
     *comparable接口使用举例（自然排序）
     * string\包装类等实现了接口，重写了compareto(obj)方法
     *
     * 重写规则：
     * 如果当前对象this大于形参对象obj，那么返回正整数；
     */

    /**
     * comparator接口(定制排序)
     * 重写compare(o1,o2)--两个参数
     *
     */

    /*
    comparable 永久性的可使用
    comparator 临时性使用/比较


     */
    @Test
    public void test(){
        String[] arr = new String[]{"AA","kk","BB","CC","yy"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test1(){
        String[] arr = new String[]{"AA","kk","BB","CC","yy"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException("输入类型不一致！");

            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

class Goods implements Comparable{

    private String name;
    private double price;

    public Goods(){}

    public  Goods(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{"+"name"+name+'\''+",price="+price+'}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;

            return Double.compare(this.price, goods.price);
        }
        throw new RuntimeException("异常");
    }
}