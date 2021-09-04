/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String num1 = scan.nextLine();
        System.out.print("What is the second number? ");
        String num2 = scan.nextLine();

        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);

        int add = x+y;
        int sub = x-y;
        int mult = x*y;
        int div = x/y;

        System.out.println(String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",x,y,add,x,y,sub,x,y,mult,x,y,div));
    }
}