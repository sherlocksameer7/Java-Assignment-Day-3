package com.proj.cels;

import java.util.Scanner;

public class Celsius_Fahrenheit {

    public static void main (String[] args)
    {
        float Fahrenheit, Celsius;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Fahrenheit Value: ");
        Fahrenheit = inp.nextFloat();                          // Degree values are in Float So,,,

        Celsius  = ((Fahrenheit-32)*5)/9;                     // This is for converting Fahrenheit into Celsius Formula.!!!
        System.out.println("Temperature in celsius is: "+Celsius);
    }
}
