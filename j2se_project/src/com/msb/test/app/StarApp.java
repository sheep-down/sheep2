package com.msb.test.app;

import com.msb.test.view.BooksView;

public class StarApp {
    public static void main(String[] args) throws Exception{//抛出异常(throws Exception)
        System.out.print("正在启动中");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        //创建BooksView对象
        BooksView booksView=new BooksView();
        //调用showUI方法
        booksView.showUI();
    }
}
