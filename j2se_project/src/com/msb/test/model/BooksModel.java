package com.msb.test.model;

import com.msb.test.control.Book;

import java.util.Arrays;

public class BooksModel {

    //创建一个数组 存入书本数据
    Book[] bookList = new Book[100];
    //定义数组下标
    int currenIndex = 0;

    //创建添加方法
    public void saveBook() {
        //将书本数据导入数组
        Book book = new Book();
        bookList[currenIndex] = book;
        //下标后移
        currenIndex++;
    }
    //查找书本的方法
    public Book findBook(String ISBN){
         //首先料到ISBN码已经存在
        Book book=null;
        for (int i=0;i<currenIndex;i++){
            //拿一个出来String equals
            Book findISBN=bookList[i];
            //找到了
            if (findISBN.getISBN().equals(ISBN)){
              book=findISBN;//找到了
                break;//退出
            }
        }
        return book;
    }
    //展示书本的方法
     public Book[] getBookList(){
        //返回一个副本
         return Arrays.copyOf(bookList,currenIndex);
     }

















}
