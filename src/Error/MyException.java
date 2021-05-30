package Error;

/**
 * 如何自定义异常类
 * 1-继承 ： Runtime \ EXception
 * 2、提供全局变量：serialVersionUID
 * 3、重载构造器
 *
 *
 */
public class MyException extends RuntimeException
{
    static final long serialVersionUID = -7034897190745766939L;//标识这个类

    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}
