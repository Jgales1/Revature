package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to iterate through all elements in a hash list.


import java.util.HashSet;
import java.util.Iterator;

public class HSExercise7 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        hset.add("John");
        hset.add("Jordan");
        hset.add("Jackson");
        hset.add("Jarrett");

        System.out.println("The HashSet elements are: ");
        for (Iterator i = hset.iterator();
        i.hasNext();){
            System.out.println(i.next());
        }
    }
}
