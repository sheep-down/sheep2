package com.msb.j2se.oop.testobj;

public class Dog implements java.io.Serializable{//实现序列化
    //名称
    String nickName;
    //品种
    String type;
    //颜色
    String color;
    //体重
    int weight;

    public Dog() {
    }

    public Dog(String nickName, String type, String color, int weight) {
        this.nickName = nickName;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

