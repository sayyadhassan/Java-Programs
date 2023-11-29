package com.company;
import java.util.Scanner;

public class SMH_35_Ch7_Practice_Set {
    // Question - 1
//    static void tabel(int n){
//        for(int i=1;i<=10;i++){
//            System.out.printf(" %d x %d = %d\n",n,i,n*i);
//        }
//    }

    // Question - 2
//    static void Pattern1(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }

    // Question - 3
//    static int sum(int n){
//        int Sum=n;
//        if(n==0){
//            return 0;
//        }
//        else {
//            return Sum + sum(n - );
//        }
//
//    }

    // Quesion - 4
//    static void Pattern2(int n){
//        for(int i=0;i<n;i++){1
//            for(int j=i;j<n;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }

    // Question - 6
//    static float avg(int...arr){
//        float average =0.0f;
//        float sum = 0.0f;
//        for(int e : arr){
//           sum += e;
//           average = sum/arr.length;
//        }
//        return average;
//    }

    // Question - 7
//    static void repeat(int b,int n){
//        if(n==0){
//            return;
//        }
//        else {
//            System.out.println(b);
//            repeat(b,n-1);
//        }
//    }

    // Question - 8
    static float temp(float n){
        return n*9/5 + 32;
    }


//    static void pattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//     static void pattern2(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    static int sum(int n){
//        if(n==0){
//            return 0;
//
//        }
//        else {
//            return n + sum(n - 1);
//        }
//    }
//
//    static float avg(int...arr){
//        float Average=0.0f;
//        float sum =0.0f;
//        for(int e : arr){
//            sum += e;
//            Average = sum/arr.length;
//        }
//        System.out.println(sum);
//        return Average;
//    }


    public static void main(String[] args) {
//        pattern(5);
//        System.out.println();
//        pattern2(5);
//        System.out.println(sum(5));
//        System.out.println("Average of 4,3,6,9,8 and 14 is : "+avg(4,3,6,9,8,14));

        Scanner sc = new Scanner(System.in);
        // Question - 1
//        System.out.println("Enter the no. to print table");
//        int n = sc.nextInt();
//        tabel(n);

        // Question -2
//        System.out.println("Enter the no. to print pattern");
//        int n = sc.nextInt();
//        Pattern1(n);

        // Question - 3
//        System.out.println("Enter the no. to print sum of first natural no.");
//        int n = sc.nextInt();
//        System.out.printf("Sum of first %d is : %d ",n,sum(n));

        // Question - 4
//        System.out.println("Enter the no. to print pattern");
//        int n = sc.nextInt();
//        Pattern2(n);

        // Question - 6
//        System.out.println("Average of 2,3,4,5 and 6 is : "+avg(2,3,4,5,6));

        // Question - 7
//        System.out.println("Enter the no. which you want to repeat");
//        int n = sc.nextInt();
//        int b =n;      // Number of recursion
//        repeat(b,n);

        // Question - 8
        System.out.println("Enter the temperature in Degree Celsius to convert in Farenheit");
        float c = sc.nextFloat();
        System.out.printf("%.2f Degree Celsius is : %.2f Farenheit",c,temp(c));
    }
}
