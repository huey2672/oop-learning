package com.huey.learning.oop.designpattern.builder;

/**
 * a case of builder pattern
 *
 * @author huey
 */
public class BuilderMain {

    public static void main(String[] args) {

        Customer customer = new Customer.Builder("Mark", "Huey")
                .gender(Gender.MALE)
                .email("mark-huey@example.com")
                .build();

        // doing something with customer
        System.out.println(customer);

    }

}
