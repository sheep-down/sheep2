package com.msb.containerwork.test1;



import com.msb.j2se.oop.day3.testextends.B;

import java.util.*;

/**
 * 遍历并输出所有商品信息
 * 找到指定编号的图书并打印【编号自己给定】
 * 删除找到指定编号的图书【编号自己给定
 */
public class Test1 {
    public static void main(String[] args) {
     Book book1=new Book("001","逆天邪神",50,"阅文");
     Book book2=new Book("002","逆天邪神",50,"阅文");
     Book book3=new Book("003","逆天邪神",50,"阅文");
     Book book4=new Book("004","逆天邪神",50,"阅文");
     HashMap<String,Book> map=new HashMap<String,Book>();
    map.put("001",book1);
    map.put("002",book2);
    map.put("003",book3);
    map.put("004",book4);
     Set<Map.Entry<String,Book>>set= map.entrySet();
     for (Map.Entry m: map.entrySet()){
         System.out.println(m.getKey()+":"+m.getValue());
     }
     //查找编号
     for (Book book: map.values()){
         if (book.getNumber().equals("002")){
             System.out.println(book);
         }
     }
       map.remove(2);
        System.out.println(map.remove(2));

    }
}




/*   System.out.println("编号\t名称\t单价\t出版社");
        for (HashMap<Integer, Book> h : booksList) {
            //获取key
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //再通过key找value
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPublish());
            }


        }*/
/*
Book book1 = new Book(001, "雾都孤儿", 50, "大大大");
    Book book2 = new Book(002, "雾都孤儿", 50, "大大");
    Book book3 = new Book(003, "雾都孤儿", 50, "大");
    HashMap<Integer, Book> map = new HashMap<Integer, Book>();
        map.put(book1.Number, book1);
                map.put(book2.Number, book2);
                map.put(book3.Number, book3);
                //将hashmap的数据放到数组里面
                ArrayList<HashMap<Integer, Book>> booksList = new ArrayList<>();
        booksList.add(map);

        ArrayList<HashMap> list = new ArrayList<HashMap>();
        list.add(map);
        Set<Map.Entry<Integer,Book>> m=map.entrySet();
        //找到
        System.out.println(map.get(001));
        //删除
        System.out.println(map.remove(003,book3));
        System.out.println(map.get(003));
*/
