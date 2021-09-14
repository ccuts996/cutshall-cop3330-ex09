/*
 *  UCF COP3330 Fall 2021 Assignment 09 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String length;
        System.out.print(" What is the width of the ceiling? ");

        length = input.next();

        Integer i = Integer.parseInt(length);

        String width;
        System.out.print(" What is the width of the ceiling? ");

        width = input.next();

        Integer j = Integer.parseInt(width);

        int area = i * j;
        int spread = 350;
        int numberofgallons = area % spread;
        int gallonsneeded;
        if (numberofgallons>0)
        {
            gallonsneeded = (area/spread) + 1;
        }
        else
        {
            gallonsneeded = area/spread;
        }
        System.out.print(" You will need " + gallonsneeded + "  gallons of paint to cover " + area + " square feet.");
    }
}

