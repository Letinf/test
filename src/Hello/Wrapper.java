package Hello;

public class Wrapper {
    static int id;
    String s;

    public void test2(){
        //包装类--》基本数据类型  ：调用 xxx
        int a = 12;
        Integer in1 = a;
        int i1 = in1.intValue();
        System.out.println(i1+1);
        Float f1 = Float.valueOf(12.3f);
        float x = f1;
        float f2 = f1.floatValue();
        System.out.println(f2);

    }
    public static void test3(){
        int num1 =10;
        method(num1);
        id = 2;

        System.out.println(id);

    }
    public void test4(){
        int num1 = 10;
        String s1 = num1+"";//连接运算
        float f1 = 12.3f;
        String s2 = String.valueOf(f1);
        //String s3 = new String(f1);
        boolean sd = Boolean.parseBoolean(s2);
        int sdsd = Integer.parseInt(s2);
        test5();

    }
    public static void test5(){
        int a = test6();

    }

    public static int test6(){
        return 1;
    }

    public static void method(Object OBJ)
    {
        System.out.println(OBJ);
    }
}
class B extends Wrapper{
    @Override
    public void test4(){
        System.out.println("重写");
    }
}