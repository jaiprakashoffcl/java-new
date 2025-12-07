package com.index;

class Book1 {

    private String title;
    private String author;
    private double price;

    public String title() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public String author() {
        return author;
    }
    public void setauthor(String author) {
        this.author = author;
    }
    public double price() {
        return price;
    }
    public void setprce(double price) {
        this.price = price;
    }
    public void discount(double percent) {
        price = price - (price * (percent / 100));
    }
}
public class Book {
    public static void main(String[] args) {

        Book1 b = new Book1();
        b.settitle("Java");
        b.setauthor("xyz");
        b.setprce(599);

        b.discount(10);

        System.out.println("Title: " + b.title());
        System.out.println("Author: " + b.author());
        System.out.println("after discount: " + b.price());
    }
}
