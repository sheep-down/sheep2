package com.msb.containerwork.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("黑龙江省","黑龙江");
        map.put("吉林省","吉林");
        map.put("辽宁省","沈阳");
        map.put("青海省","西宁");
        map.put("河北省","石家庄");
        map.put("河南省","郑州");
        map.put("山东省","济南");
        Set<Map.Entry<String,String>>set= map.entrySet();
        for(Map.Entry entry:set){
            System.out.println(entry.getKey());
        }
        for(Map.Entry entry:set){
            System.out.println(entry);
        }
    }
}
