package com.revature.Week3.Apr25.Day9.Exercise;

 // Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;

public class HSExercise6 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Red");
        hset.add("Blue");
        hset.add("Yellow");
        hset.add("Purple");
        hset.add("Pink");
        hset.add("White");
        hset.add("Green");

        System.out.println("The HashSet is: " + hset);


    }
}
