package com.msb.javase.study;

/**
 * 商品类型的使用
 */
public class GoodsApp {
    //入口点
    public static void main(String[] args) {
       //基本类型
        int age =10;
       //引用类型
        String name = "崎步 开铭";
        //String  string = new String("崎步 开铭");

        //自定义的引用类型
        Goods goods = new Goods(); //代表的是一个商品值 复杂的值

       // goods = "abc"; //类型不匹配
        goods.goodsName = "矿泉水";
        //调用方法
        goods.sale();


    }
}
