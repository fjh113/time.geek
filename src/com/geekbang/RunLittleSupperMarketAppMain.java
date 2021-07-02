package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.supermarket.Merchandise;
import com.geekbang.supermarket.littleSuperMarket;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
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

        System.out.println("超市开门了");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);
        while (open) {
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("本店地址" + littleSuperMarket.address);
            System.out.println("共有车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今日营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + ((int) (Math.random() * 10000));
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来,本店停车免费，你的车位编号是" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("不好意思，本店停车位已满");
                    continue;
                }

            } else {
                System.out.println("欢迎" + customer.name + "光临本店");
            }
            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。请输入商品编号");
                int index = scanner.nextInt();
                if (index < 0) {
                    break;
                }
                if (index >= all.length) {
                    System.out.println("请输入正确的商品编号，请输入0到" + (all.length - 1) + "之间的编号");
                    continue;
                }
                Merchandise m = all[index];
                System.out.println("您选购的商品名称" + m.name + ",单价是" + m.soldPrice + "请问你需要购买几个？");
                int numToBuy = scanner.nextInt();
                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎你再次选购");
                    continue;
                }
                if (numToBuy > m.count) {
                    System.out.println(m.name + "库存不足,请再次选购");
                    continue;
                }
                if (numToBuy * m.soldPrice + totalCost > customer.money) {
                    System.out.println("你的余额不足，请再次购买");
                    continue;
                }



                totalCost += numToBuy * m.soldPrice;


                m.count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;

            }

            customer.money -= totalCost;
            System.out.println("你的余额为" + customer.money);
            if (customer.money <= 0) {
                System.out.println("你的余额不足，请再次选购");
            }

            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }
            System.out.println("顾客" + customer.name + "共消费了" + totalCost);

            littleSuperMarket.incomingSum += totalCost;

            System.out.println("是否继续营业");
            open = scanner.nextBoolean();
        }

        System.out.println("超市今日营业结束");
        System.out.println("今日营业额" + littleSuperMarket.incomingSum + "营业额如下：");
        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0) {
                double incoming = m.soldPrice * numSold;
                double netIncoming = (m.soldPrice - m.soldPrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个,销售额为" + incoming + "净利润为" + netIncoming);
            }
        }

        littleSuperMarket.getBiggestProfitMerchandise().describe();

    }

}
