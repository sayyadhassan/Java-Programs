package com.company;

public class SMH_26_Ch6_Arrays {
    public static void main(String[] args) {
        // There are three main ways to create an array in Java
        // 1 - Declaration and memory allocation
//        int []marks = new int [5];

        // 2 - Declaration and then memory allocation
        int []marks;
        marks = new int [5];
        // Initalization
        marks[0] = 25;
        marks[1] = 30;
        marks[2] = 76;
        marks[3] = 87;
        marks[4] = 90;
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }


        // 3 - Declaration, memory allocation and initalization together
//        int []marks = {34,54,76,84};

//        int marks[] = new int[];   // throw error
//        int []marks = new int [5]{45,43,45};   // throw error
//        int marks[] = new int[3]{43,45,48};    // throw error

    }
}
