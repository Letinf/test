package Proxy;

public class ComparableCircleTest {
    public static void main(String[] args){
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        int com = c1.compare(c2);
        if (com > 0) {
            System.out.println("c1大");
        } else if (com < 0) {
            System.out.println("c2大");
        } else {
            System.out.println("一样大");
        }
        CompareObject.m();
        SubClass s = new SubClass();
        s.def();


    }
}
