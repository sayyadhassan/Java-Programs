package com.company;
import java.util.Scanner;

public class SMH_06_Excercise1_MarksCalculation {
    public static void main (String [] args)
    {
        int english,hindi,math,physics,chemistry;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        english = sc.nextInt();
        System.out.println("Enter the marks of Hindi");
        hindi = sc.nextInt();
        System.out.println("Enter the marks of Math");
        math = sc.nextInt();
        System.out.println("Enter the marks of Physics");
        physics = sc.nextInt();
        System.out.println("Enter the marks of Chemistry");
        chemistry = sc.nextInt();

        int total = english + hindi + math + physics + chemistry;
        float pr = total/5f;
        System.out.println("Total marks is : "+total+" out of 500");
        System.out.println("Total percent is : "+pr+" %");

    }
}
