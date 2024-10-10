package com.msb.test.control;

import com.msb.test.model.BooksModel;

public class BooksControl {
    //创建一个model对象
    BooksModel model=new BooksModel();

    /**
     * 添加书本
     * 将这些属性放入book对象中
     * @param name
     * @param author
     * @param price
     * @param ISBN
     * @param publish
     * @param qty
     */
    //将书本的数据存到一个对象中
    public void saveBook(String name, String author, int price, String ISBN, String publish, int qty){
        //把书本属性放到book中
        Book book=new Book(name,author,price,ISBN,publish,qty);
    }
    //查找书本ISBN码的方法
 public Book findBook(String ISBN){
      //调用model层的查找方法来找到书本的ISBN码
     return model.findBook(ISBN);
 }
//展示书本信息的方法
    public Book[] getBookList(){
        //调用model层 把书本信息存入数组
        Book[] bookList=model.getBookList();{
            String msg="";
            //拼装书本的信息
            //用for循环把书本信息从数组中提取出来
            for (int i=0;i<bookList.length;i++){
                //用toString方法展示书本信息
                msg+=bookList[i].toString();
            }
        }

        return model.getBookList();
    }
    //查找书本
    public Book findBook() {
        return model.findBook("sdd");
    }
    }


