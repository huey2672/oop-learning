package com.huey.learning.oop.designpattern.prototype;

import lombok.Data;

@Data
public class Person implements Prototype<Person> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Person(Person person) {
        this(person.getFirstName(), person.getLastName());
    }

    @Override
    public Person clone() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
