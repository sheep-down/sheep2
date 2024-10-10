package com.msb.test.view;

import com.msb.test.control.Book;
import com.msb.test.control.BooksControl;

import java.util.Scanner;
/**
 * 视图层
 */
public class BooksView {

    //创建一个control对象
    BooksControl control = new BooksControl();
    //引入Scanner
    Scanner scanner = new Scanner(System.in);
    //添加方法

public void showUI(){
    //printMenu();//菜单显示方法
    //定义菜单变量

    boolean isRun=true;
    while (isRun){
        printMenu();
        int menuIndex=scanner.nextInt();
        switch (menuIndex){
            //
            //添加功能
            case 1:
                System.out.println("书本名称");
                String name=scanner.next();
                System.out.println("书本作者");
                String author=scanner.next();
                System.out.println("书本价格");
                int price=scanner.nextInt();
                System.out.println("书本ISBN码");
                String ISBN=scanner.next();
                System.out.println("书本出版社");
                String publish=scanner.next();
                System.out.println("库存数量");
                int qty=scanner.nextInt();

                //调用业务层
                control.saveBook(name,author,price, ISBN,publish,qty);
                break;
            case 2:
                //定义一个价格变量
                 int sum=0;
                 //实现while循环查找书本
                 while (true){
                     //打印查找书本ISBN码的提示
                     System.out.println("请输入书本ISBN码");
                     String findISBN=scanner.next();
                     //顾客想要离开该功能 定义一个if语句
                     if(findISBN.equals("exit"))
                         break;
                     //去控制层查找到书本ISBN码
                     Book book=control.findBook(findISBN);
                     //定义查找到书本条形码和没有查找到条形码的if语句
                     if(book!=null){
                         //有书本
                         //打印书本的数据
                         System.out.println(book.toString());
                         //书本价格累加
                         sum=sum+book.getPrice();
                     }
                     //如果没有书本的ISBN说明书本ISBN码已经存在
                     else {
                         System.out.println("书本ISBN码存在");
                     }
                     //打印一句请支付 sum 元
                     System.out.println("请支付"+sum+"元");
                 }
            case 3:
                //展示商品
               Book[] msg=control.getBookList();
                System.out.println(msg);
                break;
            case 4:
                //按作者查找书

            case 5:
                //展示所以书本
            case 6:
                //销售书
            case 7:
                //离开
            default:
                System.out.println("请选择正确的菜单编号");

        }
    }
}
    /**
     * 重用 new堆 GC 7*24
     * 打印菜单
     */
    public static void printMenu() {
        System.out.println("-----------爱心书店V1.0-------------------");
        System.out.println("1:录入商品 2：查看商品 3：销售 4：查看报表 5：退出");
        System.out.println("-----------24期科技公司 CopyRight----------");
        System.out.print("请选择菜单编号：");
    }
}