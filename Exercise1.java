package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to append the specified element to the end of a linked list.

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> cList = new ArrayList<>();

        cList.add("Air");
        cList.add("Water");
        cList.add("Earth");
        cList.add("Fire");

        System.out.println("These are the elements in order based on the Avatar cycle " + cList);
    }
}
