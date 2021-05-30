package GenericTest;

import java.util.List;

/**
 * DAO：data access object 数据访问对象 数据持久层

 * 在dao里面操作某个类的增删改查操作
 * ORM思想：数据库每张表都会对应java的一个类，操作每个表就相当于操作每个类
 */
public class DAO<T> { //还不确定操作那张表/哪个类
    public void add(T t) {

    }

    public boolean remove(int index) {
        return false;
    }

    public void updata(int index, T t) {

    }

    public T getInDEX(int index) {
        return null;
    }

    public List<T> getAllIndex(int index) {
        return null;
    }

    //泛型方法
    //举例：返回表的记录数（long)?   返回最大的员工入职时间（date）?
    public <E> E getValue(){
        return null;
    }
}
