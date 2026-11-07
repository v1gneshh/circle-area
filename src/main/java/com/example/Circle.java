package com.example;

public class Circle {
	public static double area(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area for radius 5 = " + area(5));
    }
}
