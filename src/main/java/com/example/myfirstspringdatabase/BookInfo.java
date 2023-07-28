package com.example.myfirstspringdatabase;

import jakarta.persistence.*;

@Entity(
        name = "BookInfo"
)
@Table(
        name = "BookInfo",
        uniqueConstraints = {@UniqueConstraint(
                name = "bookinfo_name_unique",
                columnNames = {"book_name"}
        )}
)
public class BookInfo {
    @Id
    @Column(
            name = "book_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String bookName;
    @Column(
            name = "author",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String author;
    @Column(
            name = "price",
            nullable = false,
            columnDefinition = "FLOAT"
    )
    private Float price;

    public BookInfo(String bookName, String author, Float price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public BookInfo() {
    }

    public String toString() {
        return "BookInfo{name='" + this.bookName + "', author='" + this.author + "', price=" + this.price + "}";
    }
    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
