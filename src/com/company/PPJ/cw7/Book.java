package com.company.PPJ.cw7;

public class Book {
    String title;
    String author;
    int publicationYear;
    String id;
    double price;
    int quantity;

    public Book(String title, String author, int publicationYear, String id, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    // sprzedawanie książek

    public void sell ( int quantity){
        this.quantity-=quantity;
    }

    //kupowanie książek
    public void buy ( int quantity){
        this.quantity+=quantity;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
