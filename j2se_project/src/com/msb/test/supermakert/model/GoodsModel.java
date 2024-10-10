package com.msb.test.supermakert.model;

import com.msb.test.supermakert.control.Goods;

import java.util.Arrays;

public class GoodsModel {

    //数组类型 将商品存入数组中 mysql oracle redis
    Goods[] goodsList = new Goods[100];//0 1 2 3
    //用于存现在在哪个位置
    int currentIndex = 0;

    /**
     * 添加商品
     *
     * @param goods
     */
    public void addGoods(Goods goods) {
        //存入数组中
        goodsList[currentIndex] = goods;
        //下标往后移动一个位置
        currentIndex++;
    }

    /**
     * 返回一个数组副本
     *
     * @return 列表
     */
    public Goods[] getGoodsList() {
        //返回一个副本
        return Arrays.copyOf(goodsList, currentIndex);
    }

    /**
     * 查找商品
     *
     * @param code 商品编号
     * @return 返回商品对象
     */
    public Goods findGoodsByCode(String code) {
        //预判
        Goods goods = null;
        for (int i = 0; i < currentIndex; i++) {
            //拿一个出来 String equals
            Goods findGood = goodsList[i];
            //找到了
            if (findGood.getCode().equals(code)) {
                goods = findGood;//找到了
                break;//退出
            }
        }
        return goods;
    }
}
