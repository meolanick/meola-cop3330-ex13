/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;
//import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int P;
        double r;
        int t;
        int n;
        double A;

        System.out.println("What is the principal amount?");
        P = scan.nextInt();

        System.out.println("What is the rate?");
        r = scan.nextDouble();

        System.out.println("What is the number of years");
        t = scan.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        n = scan.nextInt();

        A = P * Math.pow( 1 +( (r * 0.01 ) / n ) , n * t );

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", P, r, t, n, A );

    }
}
