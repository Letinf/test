package CollectionAndMap;

import org.junit.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());

        Iterator iterator = collection.iterator();

        //System.out.println(iterator.next());
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(iterator.next());
//
//        }
        //推荐 hastnext() ：判断是否还有下一个元素，但是指针不下移       和 next():指针下移，把下移后的元素返回
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new String("Tom"));
        collection.add(new Date());

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("Tom".equals(obj)) {
                iterator.remove();
            }
        }
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
