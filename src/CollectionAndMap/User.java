package CollectionAndMap;

public class User implements Comparable{
    private String name;
    private int age;

    public User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User user = (User) o;
            int com = this.name.compareTo(user.name); //对象用compareto比较，包装类用compare比较
            if (com != 0) {
                return com;
            } else {
                return Integer.compare(this.age, user.age);
            }
        } else {
            throw new RuntimeException("d");
        }
    }
}
