package com.huey.learning.oop.designprinciple.lsp.notgood;

import java.io.IOException;

public class ReadOnlyDocument extends Document {

    @Override
    public boolean save(byte[] data) throws IOException {
        throw new UnsupportedOperationException("Unable to save read-only file.");
    }

}