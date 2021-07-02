package geekBang01;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        /***
         * 得到随机数，Java支持得到的0到1的double类型的随机数
         * 确认基本的数学方法
         * 运用取模运算符
         * 使用强制类型转换
         * 确保生成的数字在指定的范围内。   极限思维，假设随机数是0或者1 结果是多少？
         * 假设取模后是0或者mod-1，结果会是多少？
         */
        //创建Scanner来读取用户的键盘输入
        Scanner in = new Scanner(System.in);
        //游戏设置
        int rangeStart = 30;
        int rangeEnd = 60;
        int guessTotal = 5;

        //游戏统计
        int totalGameCount = 0;
        int correctGuessCount = 0;

        //是否结束游戏
        boolean gameEnd = false;
        while (!gameEnd) {
            //totalGameCount++;
            //生成指定范围内的随机数
            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始和结束必须是正数或者0");
            }
            int mod = rangeEnd - rangeStart;
            if (mod <= 1) {
                System.out.println("非法的贩子范围：(" + rangeStart + "," + rangeEnd + ")");
            }
            int bigRandom = (int) (Math.random() * (rangeEnd * 100));
            int numberToGuess = (bigRandom % mod) + rangeStart;
            if (numberToGuess < rangeStart) {
                numberToGuess = rangeStart + 1;
            } else if (numberToGuess > rangeEnd) {
                numberToGuess = rangeEnd - 1;
            }
            //剩余的猜测次数
            int leftToGuess = guessTotal;
            boolean currentGameCounted = false;
            boolean currectGuess = false;
            System.out.println("请输入要猜测的数字 范围在：（" + rangeStart + "," + rangeEnd + ").输入-1代表结束本次游戏");
            while (leftToGuess > 0) {
                System.out.println("剩余猜测次数" + leftToGuess + "请输入本次猜测的数字");
                int guess = in.nextInt();
                if (guess < 0) {
                    gameEnd = true;
                    System.out.println("用户选择结束本次游戏");
                    break;
                }
                if (!currentGameCounted) {
                    totalGameCount++;
                    currentGameCounted = true;
                }
                leftToGuess--;
                if (guess > numberToGuess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < numberToGuess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    correctGuessCount++;
                    currectGuess=true;
                    System.out.println("输入的数字正确");
                    break;
                }
            }
            if (!currectGuess){
                System.out.println("本次的目标数字是： "+numberToGuess);
            }
            System.out.println("共进行了" + totalGameCount + "次游戏， 其中猜中的次数为" + correctGuessCount);
        }
    }


}
