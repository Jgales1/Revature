package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.TreeSet;

public class TSExercise10 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("Red");
        treeSet.add("Grey");
        treeSet.add("White");
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Indigo");
        treeSet.add("Black");
        treeSet.add("Afterglow");

        System.out.println("The tree set is: " + treeSet);
    }
}
