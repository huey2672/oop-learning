package com.huey.learning.oop.designpattern.composite;

import java.io.IOException;

/**
 * left
 *
 * @author huey
 */
public class File extends AbstractFile {

    public File(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(this.name);
    }

    public byte[] open() throws IOException {
        // Our code for opening the file
        return null;
    }

    public void save(byte[] data) throws IOException {
        // Our code for saving the file
    }

}
