package com.company;

//import java.util.Scanner;   // Meth 1 - Import only Scanner Class from java.util package
import java.util.*;    // Meth 2 - Import everything from java.util package
public class SMH_65_Ch12_Using_Java_Packages {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a = sc.nextByte();
//        System.out.println("This is my Scanner with value "+a);

        // Meth 3 - Using Scanner Class without importing
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextByte();
        System.out.println("This is my Scanner with value "+a);
    }
}
