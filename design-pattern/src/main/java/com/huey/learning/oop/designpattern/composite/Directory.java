package com.huey.learning.oop.designpattern.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * composite
 *
 * @author huey
 */
public class Directory extends AbstractFile {

    private List<AbstractFile> files = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public void ls() {
        System.out.println(files.stream().map(file -> file.getName()).collect(Collectors.joining("\t")));
    }

    @Override
    protected void tree(int deep) {
        super.tree(deep);
        files.forEach(files -> files.tree(deep + 1));
    }

}
