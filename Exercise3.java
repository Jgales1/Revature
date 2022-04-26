package com.revature.Week3.Apr25.Day9.Exercise;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> cList = new ArrayList<String>();

        cList.add("Air");
        cList.add("Water");
        cList.add("Earth");
        cList.add("Fire");

        System.out.println("These are the elements in the array starting at position 1:");

        Iterator p = cList.listIterator(1);

        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
}
