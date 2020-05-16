package com.huey.learning.oop.designpattern.memento;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Stack;

/**
 * Caretaker
 *
 * @author huey
 */
public class TextEditor {

    private TextWindow textWindow;
    private Stack<TextWindowState> history = new Stack<>();

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void typewrite(String text) {
        textWindow.addText(text);
    }

    public void print(OutputStream outputStream) throws IOException {
        outputStream.write(textWindow.getCurrentText().getBytes());
    }

    public void save() {
        TextWindowState newState = textWindow.save();
        if (history.isEmpty() || !history.peek().equals(newState)) {
            history.push(newState);
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            textWindow.restore(history.pop());
        }
    }

}