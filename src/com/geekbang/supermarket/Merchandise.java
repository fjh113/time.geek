package com.geekbang.supermarket;

public class Merchandise {
    public String name; //商品名称
    public String id;  //商品id
    public int count; // 统计
    public double soldPrice; //售价
    public double purchasePrice; //进价


    // >>TODO 访问修饰符
    // >>TODO 返回值类型：无需返回值则用void表示， void是JAVA中的关键字
    // >>TODO 方法名： 任意合法的标识符都快可以
    // >>TODO
    // >>TODO 方法体： 方法的代码
    // >>TODO  方法体内定义的变量叫做局部变量

    public void  describe(){
        double netIncome = soldPrice-purchasePrice;
        System.out.println("商品的名字叫做："+name+"id是"+id+"商品的售价是"+soldPrice+"商品的进价是"+purchasePrice+
                "商品的库存是"+count+"售出一个的净利润是"+netIncome);
    }

    // >>TODO 在方法定义中指定方法的返回值类型
    // >>TODO Java中一个方法只能有一个返回值，如果不需要返回值用void表示
    // >>TODO 如果定义了返回值，则必须使用 return 语句返回方法的返回值，return是Java中的关键字
    // >>TODO 可以认为，返回值必须要能够用来给返回值类型的变量赋值
    public double calcuatrProfit(){
        double profit = soldPrice-purchasePrice;
        // >> TODO 这个return是代码块里的return，是return所在代码块中的最后一个语句
        if (profit<=0){
            return 0;
        }
        return profit;
        // >>TODO 一个方法可以有多个返回语句
    }

    // >> TODO 返回值如果不是基本类型，则要类型完全相同，或者符合类型转换的基本规则
    public double getCurrentCount(){
        return count;
    }

    // >> TODO 如果不符合规定，可以使用强制类型转换
    public int getIntSoldPrice(){
        return (int) soldPrice;
    }


    // >> TODO 参数是定义在方法名字后面的括号里的
    // >> TODO 参数定义的规范和变量一样，都是类型名字加标识符，这里的标识符我们叫做参数名
    // >> TODO 方法体内的代码可以使用参数
    // >> TODO 参数的值在调用方法的时候需要给出，有的资料叫做实参（实际参数）
    //  TODO 对应的，方法定义这里的参数，叫做形参（形式参数）

        // 如果返回值时负数，代表购买失败，（库存不足）

    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("库存不足");
            return -1;
        }
        System.out.println("商品单价为" + purchasePrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = fullPriceCount * purchasePrice + (halfPriceCount * purchasePrice / 2);
        count-=countToBuy;
        return totalCost;

    }
    // >> TODO 一个方法可以有多个参数，多个参数之间用逗号隔开

    public double buyAndPrintLeft(int countToBuy,boolean printLeft){
        if (count < countToBuy) {
            System.out.println("库存不足");
            if (printLeft){
                System.out.println("商品剩余库存"+count);
            }
            return -1;
        }
        System.out.println("商品单价为" + purchasePrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = fullPriceCount * purchasePrice + (halfPriceCount * purchasePrice / 2);
        count-=countToBuy;
        if (printLeft){
            System.out.println("商品的库存为"+count);

        }
        return totalCost;
    }


    //>> TODO 参数可以是任何类型，包括自定义类型，甚至是自己的类型都没有问题
    public boolean totalValueBiggerThan(Merchandise merchandise){
        return count*purchasePrice>merchandise.purchasePrice*merchandise.count;
    }

    //>> TODO 参数可以是任何类型，包括自定义类型
    public boolean isTheBiggestTotalvalueOne(littleSuperMarket littleSuperMarket){
        double totalValue  = count*purchasePrice;
        for (int i=0;i<littleSuperMarket.merchandises.length;i++){
            Merchandise m = littleSuperMarket.merchandises[i];
            double newTotalValue = m.count*m.purchasePrice;
            if (totalValue<newTotalValue){
                // 执行return的时候，方法直接结束，不管是不是在循环中，在第几层循环
                return false;

            }
        }
        return true;

    }







}
