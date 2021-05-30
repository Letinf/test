package CollectionAndMap;


import org.junit.Test;

import java.util.*;

/**
 * jdk5.0新增
 */
public class Foreach {
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());
        collection.add(false);

        //for (集合元素的类型 局部变量 ： 集合对象)
        for (Object obj : collection) {
            System.out.println(obj);
        }


        //jdk8 底层object[] 一开始没有长度，初始化为{}，第一次调用add时候，才创建length=10的数组
        ArrayList list = new ArrayList();


        LinkedList list1 = new LinkedList();

    }
}
