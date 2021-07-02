package com.geekbang.learn.ai;

public class learnSystem {
    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();

        int counter=0;

        for (int i=0;i<10000;i++){
            counter++;
        }
        long endMS = System.currentTimeMillis();
        System.out.println("程序执行用例多少毫秒"+(endMS-startMS));

        long startNS = System.nanoTime();
        counter =0;
        for (int i = 0;i<10000;i++){
            counter++;
        }
        long endNS = System.nanoTime();
        System.out.println("程序执行用例多少毫秒"+(endNS-startNS));
    }

}
