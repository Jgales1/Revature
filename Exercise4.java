package com.revature.Week3.Apr25.Day9.Exercise;
//Write a Java program to iterate a linked list in reverse order.

import java.util.ArrayList;
import java.util.ListIterator;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>();

        r.add("Air");
        r.add("Water");
        r.add("Earth");
        r.add("Fire");

        ListIterator i = r.listIterator(r.size());
        System.out.println("The ArrayList elements in reverse are: ");
        while (i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}
