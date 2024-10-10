package com.msb.test.supermakert.view;

import com.msb.test.supermakert.control.Goods;
import com.msb.test.supermakert.control.GoodsContol;

import java.util.Scanner;
public class GoodsView {

    //创建一个control对象
    GoodsContol control = new GoodsContol();

    public void showUI() {

        //初始化对象
        Scanner scanner = new Scanner(System.in);
        //运行标志
        boolean isRun = true;
        while (isRun) {
            //打印菜单 ctrl+alt+T
            printMenu();
            int menuIndex = scanner.nextInt();
            switch (menuIndex) {
                case 1:
                    //要录入商品 ctrl+d
                    System.out.print("请输入商品名称:");
                    String name = scanner.next();
                    System.out.print("请输入商品价格:");
                    int price = scanner.nextInt();
                    System.out.print("请输入商品条行码:");
                    String code = scanner.next();
                    //调用业务控制层
                    control.addGoods(name, price, code);
                    break;
                case 2:
                    //展示商品
                    String msg = control.getGoodsList();
                    System.out.println(msg);
                    break;
                case 3:
                    int sum = 0;
                    while (true) {
                        System.out.print("请输入条行码：");
                        String findCode = scanner.next();
                        if (findCode.equals("exit")) break;
                        //去控制层查找到商品
                        Goods goods = control.findGoodsByCode(findCode);
                        if (goods != null) {//有商品
                            System.out.println(goods.toString());
                            //累加
                            sum = sum + goods.getPrice();

                        } else {
                            System.out.println("商品条行码不存在");
                        }
                    }
                    System.out.println("请支付" + sum + "元");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("请选择正确的菜单编号");
            }
        }


    }

    /**
     * 重用 new堆 GC 7*24
     * 打印菜单
     */
    public void printMenu() {
        System.out.println("-----------爱心小店V1.0-------------------");
        System.out.println("1:录入商品 2：查看商品 3：销售 4：查看报表 5：退出");
        System.out.println("-----------24期科技公司 CopyRight----------");
        System.out.print("请选择菜单编号：");
    }

}
