package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to get the first and last elements in a tree set.


import java.util.SortedMap;
import java.util.TreeSet;

public class TSExercise14 {
    public static void main(String[] args) {
        TreeSet<String> fal = new TreeSet<String>();

        fal.add("Mark");
        fal.add("Carlos");
        fal.add("Jordan");
        fal.add("Paul");
        fal.add("Simon");
        fal.add("Jarrett");

        System.out.println("The original tree set: " + fal);
        System.out.println("The first element: " + fal.first());
        System.out.println("The last element: " + fal.last());
    }
}
