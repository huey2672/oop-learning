package com.huey.learning.oop.designpattern.builder;

import lombok.Data;

import java.sql.Date;

@Data
public class Customer {

    private String firstName;
    private String lastName;
    private Gender gender;
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;
    private Address address;

    public static class Builder {

        private String firstName;
        private String lastName;
        private Gender gender;
        private Date dateOfBirth;
        private String phoneNumber;
        private String email;
        private Address address;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder dateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }

    }

    /**
     *
     * @param builder
     */
    private Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.address = builder.address;
    }

}
