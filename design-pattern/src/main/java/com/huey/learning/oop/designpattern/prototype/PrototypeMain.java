package com.huey.learning.oop.designpattern.prototype;

/**
 * a case of prototype pattern
 *
 * @author huey
 */
public class PrototypeMain {

    public static void main(String[] args) {

        Book book = new EBook("Head First Java", new Person("Eric", "Freeman"), "pdf");

        Book bookCopy = book.clone();
        bookCopy.getAuthor().setFirstName("Elisabeth");

        System.out.println(book);
        System.out.println(bookCopy);

    }

}
