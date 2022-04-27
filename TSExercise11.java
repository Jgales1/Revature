package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to iterate through all elements in a tree set.

import java.util.Iterator;
import java.util.TreeSet;

public class TSExercise11 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("A");
        ts.add("B");
        ts.add("D");
        ts.add("L");
        ts.add("H");
        ts.add("M");
        ts.add("Z");
        ts.add("X");

        System.out.println("The tree set is: ");
        for (Iterator i = ts.iterator();
        i.hasNext(); ) {
            System.out.println(i.next());
        }
    }
}
