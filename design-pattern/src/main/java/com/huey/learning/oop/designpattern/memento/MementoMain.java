package com.huey.learning.oop.designpattern.memento;

import java.io.IOException;

public class MementoMain {

    public static void main(String[] args) throws IOException {

        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.typewrite("The Memento Design Pattern\n");
        textEditor.save();
        textEditor.typewrite("How to implement it in Java?\n");

        textEditor.undo();
        textEditor.print(System.out);

    }

}
