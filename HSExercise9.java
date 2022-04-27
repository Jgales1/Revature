package com.revature.Week3.Apr25.Day9.Exercise;

import java.util.HashSet;

// Write a Java program to empty a hash set.
public class HSExercise9 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        cars.add("Honda");
        cars.add("Ram");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Jeep");
        System.out.println("Original Hash Set is : " + cars);

        cars.isEmpty();
        System.out.println("Is the Hash Set empty before? " + cars.isEmpty());

        cars.removeAll(cars);
        System.out.println("The Hash Set after emptying: " + cars);

        cars.isEmpty();
        System.out.println("Is the Hash Set empty after? " + cars.isEmpty());
    }
}
