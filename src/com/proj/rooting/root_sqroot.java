package com.proj.rooting;

import java.util.Scanner;

public class root_sqroot {

    public static void main(String[] args) {
        Double num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextDouble();                  // For doubling it and Root & Sqroot it.!!!
        Double square = num * num;              // Double is used for Square.!!!
        System.out.println("Square of "+ num + " is: "+ square);
    }
}
