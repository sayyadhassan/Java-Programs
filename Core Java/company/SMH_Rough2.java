package com.company;

import java.util.Scanner;

public class SMH_Rough2 {
    public static void main(String []args){
        int []arr = {4,2,9,7,3};

//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1-i;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int samllestIndex = i;
                if(arr[samllestIndex] > arr[j]){
                    samllestIndex = i;
                }
                int temp = arr[samllestIndex];
                arr[samllestIndex] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
