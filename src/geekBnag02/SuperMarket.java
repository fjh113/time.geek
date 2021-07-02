package geekBnag02;

public class SuperMarket {
    public static void main(String[] args) {
        //>>TODO 使用new操作符，可以创建一个类的实列/对象（instance/object）
        //>>TODO 使用new创建一个类的实例后，类中定义的每种变量都会被赋以其类型的初始值。
        //>> TODO 这个和数组也是一样的。
        //>> TODO 使用同一个类型的对象变量，可以指向并操作这个实例。这两点和数组很类似。
        //创建一个Merchandise实例，用吗指向它。
        Merchandise m1 = new Merchandise();
        //使用点操作符，给m1指向的实例赋值。
        m1.name="茉莉花茶包 20 包";
        m1.id="0000099815";
        m1.count=1000;
        m1.price=99.9;

    }
}
