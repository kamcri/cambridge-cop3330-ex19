/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in inches: ");
        float height = sc.nextFloat();
        System.out.println("Enter your weight in pounds: ");
        float weight = sc.nextFloat();

        float BMI = weight / (height * height) * 703;

        System.out.printf("Your BMI is %.1f.\n", BMI);

        if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        if (BMI < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        if (BMI > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
