package com.msb.test.supermakert.control;

import com.msb.test.supermakert.model.GoodsModel;

public class GoodsContol {
    //创建一个model对象
    GoodsModel model = new GoodsModel();


    /**
     * 添加商品
     *
     * @param name
     * @param price
     * @param code
     */
    public void addGoods(String name, int price, String code) {
        //将商品名 价格 条行码组装存到一个对象中Goods
        Goods goods = new Goods(code, name, price);
        //调用model层
        model.addGoods(goods);
    }

    /**
     * 取得商品信息
     *
     * @return
     */
    public String getGoodsList() {
        Goods[] goodsList = model.getGoodsList();
        String msg = "";
        //拼装商品的信息
        for (int i = 0; i < goodsList.length; i++) {
            msg += goodsList[i].toString();
        }
        if (goodsList.length == 0) msg = "暂无数据";
        return msg;
    }

    /**
     * 查找商品
     *
     * @param code 商品编号
     * @return
     */
    public Goods findGoodsByCode(String code) {
        return model.findGoodsByCode(code);
    }

}
