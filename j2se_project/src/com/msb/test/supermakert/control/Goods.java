package com.msb.test.supermakert.control;

public class Goods {
    //条行码 128 39
    String code;
    //商品名
    String name;
    //分 元 价格
    int price;

    //无参构造
    public Goods() {
    }

    //有参
    public Goods(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    //===================================get/set
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "商品名称:" + name + " 价格:" + price + "元 条行码：" + code;
    }
}
