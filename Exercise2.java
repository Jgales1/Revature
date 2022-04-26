package com.revature.Week3.Apr25.Day9.Exercise;
//Write a Java program to iterate through all elements in a linked list.


import java.util.ArrayList;
import java.util.Iterator;

public class Exercise2 {
    public static void main(String[] args) {

        ArrayList<String> e = new ArrayList<String>();

        e.add("Air");
        e.add("Water");
        e.add("Earth");
        e.add("Fire");

        System.out.println("The ArrayList elements are: ");
        for (Iterator i = e.iterator();
        i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
