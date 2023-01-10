package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Array_2D {

    public static void main(String[] args) {
        
        int num[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Matrix values: ");

        for (int i=0;i<3;i++){
            for (int j=3;j<3;j++){
                num[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}



