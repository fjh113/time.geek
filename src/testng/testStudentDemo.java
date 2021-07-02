package testng;

public class testStudentDemo {
    public static void main(String[] args) {
        TestStudent student = new TestStudent();

        //pubilc TestStudent(String name)
        TestStudent student1 = new TestStudent("王大王");
        student1.show();
        //pubilc TestStudent(int age)
        TestStudent student2 = new TestStudent(30);
        student2.show();
        //pubilc TestStudent(String name,int age)
        TestStudent student3 = new TestStudent("王大王",29);
        student3.show();

        student.setName("林青霞");
        student.setAge(30);
        //student.show();
        System.out.println((student.getName())+","+student.getAge());
    }
}
