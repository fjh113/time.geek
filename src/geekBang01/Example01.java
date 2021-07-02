package geekBang01;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;
        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];

        String[] scoreNames = new String[totalScoreCount];
        scoreNames[YuWen]="语文";
        scoreNames[ShuXue]="数学";
        scoreNames[WaiYu]="外语";
        scoreNames[WuLi]="物理";
        scoreNames[HuaXue]="化学";
        scoreNames[ShengWu]="生物";

        Scanner in =new Scanner(System.in);
        System.out.println("需要保存几年的成绩");
        int yearToStore = in.nextInt();
        double[][] scores1 = new double[yearToStore][scoreNames.length];
        for (int i=0;i<yearToStore;i++){
            for (int j=0;j<scoreNames.length;j++){
                scores1[i][j]=80+Math.random()*20;
            }
        }
        System.out.println("需要查询第几年的成绩");
        int year = in.nextInt()-1;
        System.out.println("需要查询的课程编码");
        int scoreIndex = in.nextInt()-1;
        System.out.println("第"+(year+1));

    }
}
