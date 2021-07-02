package com.geekbang.supermarket;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class RunLittleSupperMarketAppMainExplam {

    public static void main(String[] args) {

        littleSuperMarket littleSuperMarket = new littleSuperMarket();
        littleSuperMarket.address = "世纪大道66";
        littleSuperMarket.superMarketName = "有家超时";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;


        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random() * 200);
            m.id = "ID" + i;
            all[i] = m;
        }
        Scanner scanner = new Scanner(System.in);
        Merchandise m0 = all[0];
        while (true) {
            System.out.println("今日超市大促销，第二件商品半价，请输入你要购买商品的索引");
            int index = scanner.nextInt();

            if (index < 0) {
                break;
            }
            if (index >= all.length) {
                System.out.println("商品索引超出界限");
                continue;
            }
            Merchandise m = all[index];
            System.out.println("商品" + m.name + "售价为" + m.soldPrice + "请问需要购买几个");
            int numToBuy = scanner.nextInt();
            m.isTheBiggestTotalvalueOne(littleSuperMarket);
            double totalCost = m.buyAndPrintLeft(numToBuy,true);

            boolean m0BiggerThan = m0.totalValueBiggerThan(m);
            System.out.println("mo的总价值比用户选择的要大"+m0BiggerThan);

            System.out.println("商品总价为"+totalCost);

        }
    }
}
