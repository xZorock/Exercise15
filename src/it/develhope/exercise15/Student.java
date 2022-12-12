package it.develhope.exercise15;

import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void guessingAge() {
        int randomInteger = new Random().nextInt(35);
        System.out.println("I generated the random number " + randomInteger + " for student " + name);
        if (randomInteger == age) {
            System.out.println("This random number is equal to the student's age");
        } else if (randomInteger > age) {
            System.out.println("This random number is greater to the student's age");
        } else {
                System.out.println("this random number is lower to the student's age");
        }
    }
}