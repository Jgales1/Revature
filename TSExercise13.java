package com.revature.Week3.Apr25.Day9.Exercise;
// Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.Iterator;
import java.util.TreeSet;

public class TSExercise13 {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<Integer>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(10);
        num.add(9);
        num.add(8);
        num.add(7);
        num.add(6);
        System.out.println("The original tree set is: " + num);

        System.out.print("The tree set in reverse: ");
        Iterator i = num.descendingIterator();{
        while (i.hasNext())
            System.out.print(i.next() + ", ");
        }
    }
}
