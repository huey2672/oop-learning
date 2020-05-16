package com.huey.learning.oop.designpattern.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class EBook extends Book {

    private String format;

    public EBook(String name, Person author, String format) {
        super(name, author);
        this.format = format;
    }

    private EBook(EBook eBook) {
        this(eBook.getName(), eBook.getAuthor() != null ? eBook.getAuthor().clone() : null, eBook.getFormat());
    }

    @Override
    public EBook clone() {
        return new EBook(this);
    }

}
