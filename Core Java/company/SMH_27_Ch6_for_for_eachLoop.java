package com.company;

import java.util.Scanner;

public class SMH_27_Ch6_for_for_eachLoop {
    public static void main(String[] args) {
//        float []marks = {45.6f,43.5f,48.3f,39.9f,90.5f};
//        String []students = {"Hassan","Naveen","Abhisekh","Jubair"};

//        int []marks = {45,43,48,39,90};
//        System.out.println("Lenght of the Array is : "+marks.length);

        // Displaying the Array (Naive way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Displaying the Array using for loop
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        // Displaying the Array in reverse order using decrementing for loop
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

        // Displaying the Array using for-each loop
//        for(int element : marks){
//            System.out.println(element);
//        }

        // Taking input from user and print using for-each loop
        int []mat = new int [3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in the array");

        for(int i=0;i<mat.length;i++){
            mat[i]=sc.nextInt();
        }

//        for(int e :mat){                 // Why this will not initialize the values
//            e = sc.nextInt();
//        }

        for(int e : mat){
            System.out.println(e);
        }


    }
}
