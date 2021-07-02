package com.geekbang.supermarket;

public class littleSuperMarket {
    public String superMarketName; //超市名称
    public String address; //超市地址
    public int parkingCount; //停车数量
    public double incomingSum; //进店人数
    public Merchandise[] merchandises;//商品数量
    public int[] merchandiseSold;//卖出数量



    public Merchandise getBiggestProfitMerchandise(){
        Merchandise curr = null;
        for (int i=0;i<merchandises.length;i++){
            Merchandise m = merchandises[i];
            if (curr==null){
                curr =m;
                continue;
            }else {
                if (curr.calcuatrProfit()<m.calcuatrProfit()){
                    curr=m;
                }
            }
        }
        return curr;
    }
}
