package com.company;
import java.util.Scanner;

public class SMH_07_Ch1_Practice_Set {
    public static void main(String[] args) {
      /*  // Question - 1
        int a = 40;
        int b = 7;
        int c = 37;
        int sum = a + b + c;
        System.out.println("Sum of three number is : "+sum);


        // Question - 2
        System.out.println("Enter the marks of subject 1,2 and 3");
        Scanner sc = new Scanner (System.in);
        int sub1,sub2,sub3;
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        float CGPA = (sub1+sub2+sub3)/30f;
        System.out.println("CGPA of three subject is : "+CGPA);


        // Question - 3
        System.out.println("Enter your name");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        System.out.println("Hello "+str+", have a good day.");
        System.out.printf("Hello %s have a good day",str);   Another method to print */


        // Question - 4
        System.out.println("Enter the Kilometer to convert into Mile");
        Scanner sc = new Scanner (System.in);          // 1 Kilometer = 0.621 Miles
        float kilometer = sc.nextFloat();                      // 1 Mile  = 1.60934 Kilometers
        float mile = kilometer/1.609f;
        System.out.println(kilometer+" Kilometer is equla ot "+mile);


      /*  // Question - 5
        System.out.println("Enter a number");
        Scanner sc = new Scanner (System.in);
        boolean b = sc.hasNextInt();
        if(b==true)
            System.out.println("Integer");
        else
            System.out.println("Not Integer");     */

//        // Bitwise Operation
//        int a =2;           // First of all JVM converted these integers in binary form then perform operation
//        int b =3;
//        System.out.println(a & b);
//        System.out.println(a | b);
    }
}
