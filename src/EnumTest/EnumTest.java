package EnumTest;

public class EnumTest {
public static void main(String[] args){
    Season summer = Season.SUMMER;
    System.out.println(summer);

    Season1 spring = Season1.SPRING;
    spring.show();

//    Season[] values = Season.values();
//    for (int i = 0; i < values.length; i++) {
//        System.out.println(values[i]);
//    }
}
}

enum Season{
    //1、提供当前枚举类的对象，对象间用,最后用;
    SPRING("春天", "春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINNER("冬天","冰天雪地");

    //2、声明season对象的属性  private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3、私有化类的构造器
    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //4、诉求：获取属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //5、诉求2：重写tostring(）

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

interface Info{
    void show();
}

/**
 * enum实现接口
 */
enum Season1 implements Info{
    //1、提供当前枚举类的对象，对象间用,最后用;
    SPRING("春天", "春暖花开"){ // 可以在枚举类的每个对象这里重写方法
        @Override
        public void show() {

        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {

        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {

        }
    },
    WINNER("冬天","冰天雪地"){
        @Override
        public void show() {

        }
    };

    //2、声明season对象的属性  private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3、私有化类的构造器
    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //4、诉求：获取属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //5、诉求2：重写tostring(）

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }
}