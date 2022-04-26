package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to insert the specified element at the specified position in the linked list.


import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {

        ArrayList<String> eList = new ArrayList<String>();

        eList.add("Air");
        eList.add("Water");
        eList.add("Earth");
        eList.add("Fire");

        System.out.println("The original array list is: " + eList);
        System.out.println("Adding 2 new elements");
        eList.add(1, "Metal");
        eList.add(3, "Wood");

        System.out.println("The new array list is: " + eList);
    }
}
