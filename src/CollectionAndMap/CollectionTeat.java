package CollectionAndMap;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * collection方法
 */
public class CollectionTeat {
    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());

        System.out.println(collection.size());

        Collection col = new ArrayList();
        col.add("FYGF");
        col.add("assadada121345");
        collection.addAll(col);
        System.out.println(collection);//println默认进行了object-->string 类型转换再toString打印输出


        //Collection coll1 =

    }

    /**
     * list方法
     *
     * 增：add
     * 删：remove
     * 改：set
     * 查：get
     * 插入：add
     * 长度size()
     * 遍历：1、Iterator迭代器方式
     *      2、增强for循环
     *      3、普通循环
     *
     */
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("AA");

        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    /**
     * set: 存储无序的，不可重复的数据  (无序指的不是打印和添加顺序一致,比如list存储地址是连续的，set是随机存储)
     *
     * 存储的数据不是按照索引值顺序排列，而是根据数据的哈希值（hashcode）来存储！！！
     *
     * 实现类有三种：1、 hashset：主要实现类，线程不安全的，可以存储null值
     *             2、linkedhashset:作为hashset的子类，遍历内部数据时，可以按照添加的顺序遍历
     *             3、Treeset:可以按照添加的对象指定属性，进行排序
     *
     *
     * set接口完全使用collection的方法，没有新增方法
     *
     * 不可重复性：
     * 保证添加的元素按照equals（）判断时，不能返回true，相同元素only one
     *
     * 添加元素的过程，以hashset为例：(数组＋链表)
     * 添加a。首先调用a所在类的hashcode()方法，计算哈希值，得到存放位置，判断数组此位置上是否有元素。如果没有元素，直接添加。如果有，
     * 先比较hash值，如果不同直接添加，如果不同再比较equals()
     *
     * true---失败；
     * false--成功.
     *
     *
     */
    @Test
    public void test2(){
        Set set = new HashSet();

        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new String("shfdisdhfuis"));
        set.add(new Date());
        set.add(false);

        for (Object o : set) {
            System.out.println(o);
        }

        int a = "sd".hashCode();
        int b = "sd".hashCode();
        System.out.println(a==b);

    }

    @Test
    public void test3(){
        Set set = new LinkedHashSet(); //数组+双向链表，每个数据维护了两个引用（=*const)

        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new String("shfdisdhfuis"));
        set.add(new Date());
        set.add(false);

        for (Object o : set) {
            System.out.println(o);
        }
    }


    /**
     * Treeset:
     * 添加的对象，要求是相同类的对象
     *
     *自然排序 和 定制排序
     */
    @Test
    public void test4(){
        Set set = new TreeSet();
//        set.add(456);
//        set.add(123);
        //set.add("AA");

        set.add(new User("Jerry", 32));
        set.add(new User("Jerry", 26)); //treeset和上述不一样，不是通过equal（），而是仅仅通过compareto
        set.add(new User("Tom", 65));
        set.add(new User("Jack", 4));

        for (Object o : set) {
            System.out.println(o);
        }

    }
    //定制排序
    @Test
    public void test5(){


        Comparator com = new Comparator() {
            //按照age从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(), user2.getAge());
                } else {
                    throw new RuntimeException("sd");
                }
            }
        };

        Set set = new TreeSet(com); //带参数就是定制排序，空参默认自然排序
        set.add(new User("Jerry", 32));
        set.add(new User("Jerry", 26));
        set.add(new User("Tom", 65));
        set.add(new User("Jack", 4));

        for (Object o : set) {
            System.out.println(o);
        }

    }

    /**
     * map
     * 1、hashmap:主要实现类，线程不安全，效率高
     * 2、linkedhaspmap:
     * 3、treemap:按照key的自然排序或定制排序
     * 4、hashtable:古老实现类，线程安全但效率低
     * 5、properties :处理配置文件，key和values都是string类型
     *
     * 底层：
     * 数组+链表 （jdk7)
     * 数组+链表+红黑树
     *
     *
     * map中的key要求不能重复和无序，要求key所在的类要重写equals()和hashcode()
     * values所在类要重写equals()
     */
    @Test
    public void test6(){
// ConcurrentHashMap  :分段锁
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);

        System.out.println(map);

//        map = new HashMap();
//        System.out.println(map);

        Object value = map.remove("CCC");
        System.out.println(value);
        System.out.println(map);
//        map.clear();
//        System.out.println(map);

        System.out.println(map.containsKey("AA"));
        System.out.println(map.containsValue(123));
        HashMap map1 = new HashMap();
        System.out.println(map.equals(map1));

    }
    /**
     *
     */
    @Test
    public void test7(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);
        map.put("BB", 156);

        //遍历所有的key
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collection c = map.values();
        for (Object o :c) {
            System.out.println(o);
        }

        Set s = map.entrySet();
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            Map.Entry entry = (Map.Entry) o;
            //System.out.println(entry);
            System.out.println(entry.getKey()+"...."+entry.getValue());
        }
    }

    /**
     * treemap
     */
    @Test
    public void test8(){
        Map map = new TreeMap();
        map.put(new User("sd", 45),45);
    }

    @Test
    public void test9()  {
        FileInputStream f = null;
        try {
            Properties properties = new Properties();
            f = new FileInputStream("jdbc1.properties");
            properties.load(f);

            String name = properties.getProperty("name");
            String password = properties.getProperty("password");
            System.out.println(name + " " +password);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (f!=null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test10(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-97);

        int fre = Collections.frequency(list, 765);
        System.out.println(fre);
        List l = new ArrayList();

        List list1 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list1,list);
        System.out.println(list1);
    }

    @Test
    public void test11(){
        List list = new ArrayList();
        List list1 = Collections.synchronizedList(list);
    }
}
