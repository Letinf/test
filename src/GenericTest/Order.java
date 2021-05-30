package GenericTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义泛型类、泛型方法、泛型方法
 */
public class Order<T> {
    String orderName;
    int orderId;

    T orderT;

    T[] arr = (T[]) new Object[10];
    public Order(){

    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    //泛型方法
    //泛型方法可以为static，因为是泛型方法参数是调用时候确定，而不是类加载时候确定
    public   <E>  List<E> copyList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);

        }
        return list;
    }
}
