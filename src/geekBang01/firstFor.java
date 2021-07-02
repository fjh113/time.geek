package geekBang01;

public class firstFor {
    /***
     * 找出可以divided整除dividor的所有数
     * 并且只取10个数
     * 使用break退出
     * 使用continue跳出 不符合条件的循环
     *
     */


    public static void main(String[] args) {
        int divided = 10;
        int divisor = 30;

        int found = 0;
        int toBeFound = 10;
        for (int i = 0; i < 100; i++) {
            if (divided<divisor){
                System.out.println(divided+"小于"+divisor+"当前循环跳出");
                divided++;
                continue;
            }
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + ",商为" + (divided / divisor));
                found++;
            }
            if (found>=toBeFound){
                System.out.println("已经找到"+toBeFound+"个数， 循环退出");
                break;
            }
            divided++;
        }


    }


}
