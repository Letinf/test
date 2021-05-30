package Hello;

public class AbstractTest {
    public static void main(String[] args){


    }
}
//抽象类中有构造器，但是父类不能实例化，只能给子类实例化时候调用
abstract class Person{


    String name;
    int age;

    public  Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();

    public void walk(){
        System.out.println("人走路");
    }

}
//若父类存在抽象方法，子类必须重写所有的抽象方法 or 把子类定义为abstract
class Student extends  Person{

    public Student(String name,int age){
        super(name,age);
    }
    public  void eat(){
        System.out.println(123);
    }
    Person h = new Person() {

        @Override
        public void eat() {

        }
        @Override
        public void walk() {

        }
    };

}
class Teacher {
    public void eat(){}

    public void walk(){}

}