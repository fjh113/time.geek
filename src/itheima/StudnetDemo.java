package itheima;
/*
    创建对象并为其对象赋值的两种方式
        1.无参构造方法创建对象后使用setXxx()赋值
        2.使用带参构造方法直接创建带有属性值的对象

 */
public class StudnetDemo {
    public static void main(String[] args) {
        //无参构造方法
        Student s = new Student();
        s.setName("王中王");
        s.setAge(30);
        s.show();
        //有参构造方法
        Student s1  = new Student("王中王",30);
        s1.show();

    }

}
