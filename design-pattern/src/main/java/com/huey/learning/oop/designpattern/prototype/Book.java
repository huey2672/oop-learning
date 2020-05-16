package com.huey.learning.oop.designpattern.prototype;

import lombok.Data;

@Data
public class Book implements Prototype<Book> {

    private String name;
    private Person author;

    public Book(String name, Person author) {
        this.name = name;
        this.author = author;
    }

    private Book(Book book) {
        this(book.getName(), book.getAuthor() != null ? book.getAuthor().clone() : null);
    }

    @Override
    public Book clone() {
        return new Book(this);
    }

}
