package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value x:");
        double x = scanner.nextDouble();

        System.out.println("Enter the value y:");
        double y = scanner.nextDouble();

        final double p = 2;

        double x1 = Math.pow(x,p);
        double y1 = Math.pow(y,p);
        System.out.println("x1 and y1 are :"+ x1 +" and "+ y1 );

        double d = x1 + y1;
        double distance = Math.sqrt(d);
        System.out.println("Distance is :"+distance);
    }
}
