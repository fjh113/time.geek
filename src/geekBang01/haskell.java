package geekBang01;

public class haskell {
    /***
     *计算乘法表
     * 两个数相乘，外层循环代表乘数，内层循环代表被乘数
     * 循环嵌套，变量名不可以重复
     *使用break语句让输出的乘法表更简洁
     *使用String变量，做String的加法
     *
     */
    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            String line = "";
//            for (int j = 1; j <= 9; j++) {
//
//                if (j > i) {
//                    break;
//                }
//                line += i + "*" + j + "=" + (i * j) + "\t";
//                System.out.println(line);
//            }
//        }
//    }

        /**
         找出可以divided整除dividor的所有数
         * 并且只取10个数
         * 使用break退出
         * 使用continue跳出 不符合条件的循环
         *
         */
        int n = 10;
        int divided=100;
        int divisor = 89;
        int found=0;
        while (found<n){
            if (divided%divisor==0){
                found++;
                System.out.println(divided + "可以整除" + divisor + ",商为" + (divided / divisor));
            }

            divided++;
        }
    }

    }
