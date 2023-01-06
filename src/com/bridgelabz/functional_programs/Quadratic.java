package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b :");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c :");
        int c = scanner.nextInt();

        int delta = b*b-4*a*c;

        if (delta >= 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The real roots of quadratic equation ara :"+x1+" and "+x1);

            }
            else{
                System.out.println("The roots of quadratic equation are imaginary .");
            }
    }
}

