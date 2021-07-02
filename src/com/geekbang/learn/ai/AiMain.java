package com.geekbang.learn.ai;

import java.util.Scanner;

public class AiMain {
    public static void main(String[] args) {
        Ai ai = new Ai();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input =scanner.next();
            if ("exit".equals(input)){
                System.out.println("再见！");
                break;
            }
            String answer = ai.answer(input);
            System.out.println(answer);
        }
    }
}
