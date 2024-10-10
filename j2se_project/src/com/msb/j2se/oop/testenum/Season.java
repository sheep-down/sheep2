package com.msb.j2se.oop.testenum;

public enum Season {

    //ctrl+shift+U 大小写变化
    SPRING(1,"春天"),
    SUMMER(2,"夏天"),
    AUTUMN(3,"秋天"),
    WINTER(4,"冬天");

    int value;//用于数据存储传输
    String desc;//描述

    //枚举不需要public构造
    Season(int value,String desc){
        this.desc=desc;
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

