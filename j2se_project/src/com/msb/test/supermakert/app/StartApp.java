package com.msb.test.supermakert.app;

import com.msb.test.supermakert.view.GoodsView;

public class StartApp {
    public static void main(String[] args) throws Exception {
        System.out.print("正在启动中");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        //展示UI
        GoodsView goodsView = new GoodsView();
        goodsView.showUI();
    }
}
