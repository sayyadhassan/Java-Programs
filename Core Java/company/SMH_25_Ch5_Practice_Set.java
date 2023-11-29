package com.company;
import java.util.Scanner;

public class SMH_25_Ch5_Practice_Set {
    public static void main(String[] args) {
        // Question - 1
//        int n = 4;               // Number of lines to print star (*)
//        for(int i=n;i>0;i--){
//            for(int j=i;j>0;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
                // OR
        // Question - 1
//        int n = 4;               // Number of lines to print star (*)
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        // Question - 2
        int n=8;                                // Even Number - 2*n
        int i=0;                                // Odd Number - 2*n+1
        int sum =0;
        while(i<n){
            sum = sum+i*2;
            i++;
        }
        System.out.println(sum);

        // Question - 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. which you want to print tabel");
//        int n = sc.nextInt();
//     // for(int i=0;i<10;i++)        Goes from i=0 to i=9
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
//          //  System.out.println(n+" x "+i+" = "+tabel);
//        }

        // Question - 4
//        int n = 10;
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
//           // System.out.println(n+" x "+i+" = "+tabel);
//        }
//
        // Question - 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. which you want to print the factorial");
//        int f = sc.nextInt();
//        int factorial =1;
//        for(int i=f;i>=1;i--){
//            factorial *= i;
//        }
//        System.out.println(factorial);

        // Question - 9
//        int n=8;
//        int sum=0;
//        for(int i=1;i<=10;i++){
//            int tabel = n*i;
//            sum +=tabel;
//        }
//        System.out.println("Sum of multiplication of tabel 8 is : "+sum);
    }
}
