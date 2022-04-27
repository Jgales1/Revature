package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.TreeSet;

public class TSExercise12 {
    public static void main(String[] args) {
        TreeSet<String> el1 = new TreeSet<String>();
        el1.add("Red");
        el1.add("Blue");
        el1.add("Green");
        System.out.println("Tree set 1 is: " + el1);

        TreeSet<String> el2 = new TreeSet<String>();
        el2.add("Black");
        el2.add("Orange");
        el2.add("Navy");
        System.out.println("Tree set 2 is: " + el2);

        el1.addAll(el2);
        System.out.println("Tree set 1 and 2 together is: " + el1);
    }
}
