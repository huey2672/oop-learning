package com.huey.learning.oop.designprinciple.srp.notgood;

import lombok.Data;

@Data
public class Book {

    private String name;
    private String author;
    private String text;

    void printTextToConsole() {
        // Our code for formatting and printing the text to console
    }

}
