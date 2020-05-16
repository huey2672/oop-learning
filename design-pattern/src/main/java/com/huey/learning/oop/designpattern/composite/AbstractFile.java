package com.huey.learning.oop.designpattern.composite;

import lombok.Getter;
import lombok.Setter;

/**
 * component
 *
 * @author huey
 */
public abstract class AbstractFile {

    @Getter
    @Setter
    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    /**
     * list directory contents
     */
    public abstract void ls();

    /**
     * list contents of directories in a tree-like format.
     */
    public final void tree() {
        tree(0);
    }

    protected void tree(int deep) {

        StringBuilder lineBuilder = new StringBuilder();
        if (deep > 0) {
            for (int i = 0; i < deep - 1; i++) {
                lineBuilder.append("    ");
            }
            lineBuilder.append("└── ");
        }
        lineBuilder.append(this.name);

        System.out.println(lineBuilder.toString());

    }

}
