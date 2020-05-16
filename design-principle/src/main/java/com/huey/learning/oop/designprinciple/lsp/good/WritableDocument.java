package com.huey.learning.oop.designprinciple.lsp.good;

import java.io.IOException;

public class WritableDocument extends Document {

    public boolean save(byte[] data) throws IOException {
        // Our code for saving the document
        return true;
    }

}
