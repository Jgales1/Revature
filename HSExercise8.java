package com.revature.Week3.Apr25.Day9.Exercise;
//Write a Java program to get the number of elements in a hash set.


import java.util.HashSet;

public class HSExercise8 {
    public static void main(String[] args) {
        HashSet<String> flavors = new HashSet<>();

        flavors.add("Cherry");
        flavors.add("Vanilla");
        flavors.add("Mango");
        flavors.add("Blueberry");
        flavors.add("Raspberry");
        flavors.add("Papaya");
        flavors.add("Strawberry");
        flavors.add("Orange");

        flavors.size();

        System.out.println("There are " + flavors.size() + " flavors on the menu!" );

        System.out.println("The flavors of ice cream are: " + flavors);

    }
}
