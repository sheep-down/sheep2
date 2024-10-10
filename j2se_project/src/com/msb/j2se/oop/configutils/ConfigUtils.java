package com.msb.j2se.oop.configutils;

import org.w3c.dom.Entity;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ConfigUtils {
    /**
     * 读取配置文件中的信息
     * 提供读取功能【控制为只读】
     */
 private static Properties prop=null;
 //类加载时读取配置文件
 static {
     //创建一个配置文件
     try {
         prop=new Properties();
         //从文件中加载配置
         prop.load(new FileReader("conf/db.properties"));
     } catch (IOException e) {
         e.printStackTrace();
     }
 }

    /**
     * 取得配置文件
     * @param key 键
     * @return 值
     */
 public static String getValue(String key){
     return prop.getProperty("driver_class","com.mysql.cj.jdbc.Driver");
 }
 public static int getIntValue(String key){
     //转换为int 类型
     return Integer.parseInt(prop.getProperty("password","123456"));
 }

    public static void main(String[] args) {
        String driverClass=ConfigUtils.getValue("driver_class");
        System.out.println(driverClass);
        int password=ConfigUtils.getIntValue("password");
        System.out.println(password);
    }

}
/*
//类加载时 读取配置文件
static {
        try {
        //创建一个配置文件
        prop =new Properties();
        //从文件中加载配置
        prop.load(new FileReader("conf/db.properties"));
        }catch (IOException e){
        e.printStackTrace();
        }
        }
*/
/*从内存缓冲区或字符串缓冲区中获取数据*//*


*/
/**
 *取得配置信息
 * @return
 *//*

public static String getValue(String key){
        return prop.getProperty(key,"暂无配置信息");
        }

*/
/**
 * 取得Int类型
 * @param key
 * @return
 *//*

public  static int getIntValue(String key){
        return Integer.parseInt(prop.getProperty(key));
        }

public static void main(String[] args) {
        String driverClass= ConfigUtils.getValue("driver_class");
        System.out.println(driverClass);
        */
/* System.out.println(ConfigUtils.getIntValue("aaa"));*//*

        System.out.println(ConfigUtils.getIntValue("max_number")+1);
        }*/
