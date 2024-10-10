package com.msb.containerwork.test1;

public class Book{
    String Number;
    String name;
    int price;
    String publish;

    public Book() {
    }

    public Book(String number, String name, int price, String publish) {
        Number = number;
        this.name = name;
        this.price = price;
        this.publish = publish;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Number='" + Number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publish='" + publish + '\'' +
                '}';
    }
}
