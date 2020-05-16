package com.huey.learning.oop.designpattern.composite;

public class CompositeMain {

    public static void main(String[] args) {

        Directory book = new Directory("BOOK");
        Directory computer = new Directory("COMPUTER");
        Directory fiction = new Directory("FICTION");
        Directory magicNovel = new Directory("Magic Novel");
        File effectiveJava = new File("Effective Java.pdf");
        File introductionToAlgorithms = new File("Introduction to Algorithms.pdf");
        File oneHundredYearsOfSolitude = new File("One Hundred Years of Solitude.txt");
        File aSongOfIceAndFire = new File("A Song of Ice and Fire.epub");
        File harryPotter = new File("Harry Potter.epub");

        book.add(computer);
        book.add(fiction);
        computer.add(introductionToAlgorithms);
        computer.add(effectiveJava);
        fiction.add(magicNovel);
        fiction.add(oneHundredYearsOfSolitude);
        magicNovel.add(aSongOfIceAndFire);
        magicNovel.add(harryPotter);

        book.tree();
//		fiction.ls();
    }

}
