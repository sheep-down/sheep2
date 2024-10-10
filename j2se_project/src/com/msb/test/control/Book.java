package com.msb.test.control;

public class Book {
    //book的属性
    String name;
    String author;
    int price;
    String ISBN;
    String publish;
    int qty;
//构造方法

    public Book() {
    }

    public Book(String name, String author, int price, String ISBN, String publish, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        this.publish = publish;
        this.qty = qty;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", ISBN=" + ISBN +
                ", publish='" + publish + '\'' +
                ", qty=" + qty +
                '}';
    }
}
