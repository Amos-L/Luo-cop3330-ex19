/*
 *  UCF COP3330 Fall 2021 Assignment 1.19 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("Please enter height in inches: "); //Asking for user input
        double height = x.nextDouble();
        System.out.print("Please enter weight in pounds: ");
        double weight = x.nextDouble();

        double BMI = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f\n", BMI);
        if(BMI >= 18.5 && BMI <= 25){
            System.out.printf("You are within the ideal weight range.");
        }
        if(BMI < 18.5) {
            System.out.printf("You are underweight. You should see your doctor.");
        }
        if(BMI > 25){
            System.out.printf("You are overweight. You should see your doctor.");
        }
    }
}
