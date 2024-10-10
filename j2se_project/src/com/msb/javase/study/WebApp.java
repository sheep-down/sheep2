package com.msb.javase.study;

/**
 * 静态的使用
 */
public class WebApp {

    public static void main(String[] args) {
        //来一个百度的网页
        Web web = new Web();
        web.title="百度";
        web.num=2000;

        Web web2 = new Web();
        web2.title="百度内页";
        web2.num=1000;


        ///访问静态属性
        Web.count = 12;  //类的属性
        web2.count = 12222;  //不建议的   成员 去访问
        //Web.web2.count = 12222;  // Web.count = 12222;
        System.out.println(web.count);  //Web.web.count -->Web.count
    }

}
