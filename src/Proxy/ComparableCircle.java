package Proxy;

public class ComparableCircle extends Circle implements CompareObject
{
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compare(Object o) {
        if(this == o)
            return 0;
        if(o instanceof CompareObject){
            ComparableCircle c = (ComparableCircle) o;
            //return (int)(this.getRadius() - c.getRadius()); 错误 int精度问题
            if (this.getRadius() > c.getRadius()) {
                return 1;

            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            }
            //
            else
                return 0;
        }
        else
            throw new RuntimeException("传入的数据类型不匹配");
    }
}
//报异常就不用return了