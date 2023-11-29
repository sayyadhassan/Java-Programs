package com.company;
import java.util.Scanner;

public class SMH_29_Ch6_Practice_Set {
    public static void main(String[] args) {
        // Question - 1
//        float []arr = {23.3f,43.3f,53.3f,63.3f,73.3f};
//        float sum = 0.0f;
////        for(int i=0;i<arr.length;i++){       // Using for loop
//             sum=sum+arr[i];
//        }
        //       OR
//        for(float element:arr){              // Using for-each loop
//            sum = sum + element;
//        }
//        System.out.println("Sum of floats is :"+sum);

        // Question - 2
//       float []arr = {23.3f,43.3f,53.3f,63.3f,73.3f};
//        System.out.println("Enter the no. which you search in array");
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        boolean isInArray = false;
//        int b = 0 ;
//        for(int i=0;i<arr.length;i++){       // Using for loop
//            if(a==arr[i]){
//                isInArray = true;
//                b=i;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("Element is present at index no. "+b);
//        }
//        else{
//            System.out.println("Element is not present in the array");
//        }

        //         OR

//        for(float element:arr){               // Using for-each loop
//            if(a==element){
//                isInArray=true;
//                break;
//            }
//            b++;
//        }
//        if(isInArray){
//            System.out.println("Element is present at index no. : "+b);
//        }
//        else {
//            System.out.println("Element is not present in the array");
//        }



        // Question - 3
//        int []marks = {56,78,87,89,75,79};
//        float sum=0.0f;
//        for(int element:marks){
//              sum=sum+element;
//        }
//        System.out.println("Average of Students in Physics is : "+sum/marks.length);


        // Question - 4
//        int [][]mat1 = {{2,3,8},
//                        {3,8,9}};
//        int [][]mat2 = {{3,4,8},
//                        {6,6,7}};
//        int [][]result = {{0,0,0},
//                          {0,0,0}};
//        for(int i=0;i<mat1.length;i++) {          // row no. of items
//            for (int j = 0; j < mat1[i].length; j++) {  // column no. of items
//                System.out.printf("Setting the value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            // Printing the elements of 2-D array
//        }
//        for(int i=0;i<mat1.length;i++){          // row no. of items
//                for(int j=0;j<mat1[i].length;j++){  // column no. of items
//                    System.out.print(result[i][j]+" ");
//                }
//                System.out.println();
//        }

        // Question - 5
        int []arr = {43,45,34,56,78,98};
        int l = arr.length;
        int n = Math.floorDiv(l,2);    // It divide l by 2 and return only greatest integer
        int temp;
        for(int i=0;i<n;i++){
        // Swap elements
           temp = arr[i];
           arr[i] = arr[l-i-1];
           arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }

        // Question - 6
//        int []arr = {43,45,34,56,78,98};
//        int max=0;
        // int max = Integer.Min_Value;    // Return minimum value of integer
//        for(int e:arr){
//            if(e>max)
//            {
//                max = e;
//            }
//        }
//        System.out.println("The value of the maximum element is "+max);

        // Question - 7
//        int []arr = {43,45,34,56,78,98};
//        int min=Integer.MAX_VALUE;     // Return maximum value of integer
//        for(int e:arr){
//            if(e<min)
//            {
//                min = e;
//            }
//        }
//        System.out.println("The value of the minimum element is "+min);

        // Question - 8
//        int []arr = new int[5];
//        boolean isSorted= true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the elements of array");
//
////        for(int element:arr){                      // Why giving just opposite output..
////            arr[element]=sc.nextInt();
////        }
//
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("Element is  sorted");
//        }
//        else {
//            System.out.println("Element is not sorted");
//        }
    }
}
