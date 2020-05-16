package com.huey.learning.oop.designprinciple.lsp.good;

import lombok.Data;

@Data
public class Document {

    private String filename;

    public byte[] open() {
        // Our code for opening the document
        return null;
    }

}
