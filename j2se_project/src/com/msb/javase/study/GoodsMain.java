package com.msb.javase.study;

/**
 * 使用自定义类型
 */
public class GoodsMain {
    //栈
    public static void main(String[] args) {
        //使用 Goods 创建商品
        Goods g  = new Goods();  //new 存储数据

        //通过引用名.属性  找到小盒子  属性
        System.out.println("----商品的信息为:---");
        System.out.println("商品的数量:"+g.goodsNum); //访问属性
        System.out.println("商品的价格:"+g.goodsPrice);
        System.out.println("商品的名:"+g.goodsName);

        g.goodsNum+=1;  //访问属性
        System.out.println("----商品的信息更改为:---");
        System.out.println("商品的数量:"+g.goodsNum);

    }
}
