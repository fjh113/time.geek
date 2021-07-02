package testng;

/*
学生类
 */
public class TestStudent {
    //成员变量
    private String name;

    private int age;

    //构造方法
    public TestStudent() {
        System.out.println("无参构造方法");
    }

    public TestStudent(String name) {
        this.name = name;
    }
    public TestStudent(int age){
        this.age=age;
    }
    public TestStudent(String name,int age){
        this.name = name;
        this.age = age;
    }

    //提供set/get方法
    public void setAge(int a) {
        //age=a;
        if (a < 0 || a > 120) {
            System.out.println("你输入的年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
