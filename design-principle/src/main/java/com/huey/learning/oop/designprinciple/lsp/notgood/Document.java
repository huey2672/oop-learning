package com.huey.learning.oop.designprinciple.lsp.notgood;

import java.io.IOException;

import lombok.Data;

@Data
public class Document {

    private String filename;

    public byte[] open() {
        // Our code for opening the document
        return null;
    }

    public boolean save(byte[] data) throws IOException {
        // Our code for saving the document
        return true;
    }

}