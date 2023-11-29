package com.company;
import java.util.Scanner;
public class SMH_12_Ch2_Practice_Set {
    public static void main (String []args)
    {
       // Question - 1
     // float a = 7/4*9/2;          // Answer is 4.0, Integer and Integer is evaluted as Integer also
//        float a = 7/4.0f*9/2.0f;    // Answer is 7.875 , Integer and Float is evaluted as Float
//        System.out.println(a);

        // Question - 2
        char grade = 'B';
        System.out.println(grade+8);     // First of all convert grade(B) into ASCII then add 8 and print
        grade = (char)(grade + 8);      // Typecast from int to char
        System.out.println(grade);
        // Decrypt
        grade = (char)(grade - 8);
        System.out.println(grade);

        // Question - 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = sc.nextInt();
//        int b =8;
//        System.out.println(a>b);

//        // Question - 4
//        int v=2,u=3,a=6;
//        float s=5f;
//        float w = (v*v-u*u)/(2*a*s);
//        System.out.println(w);

        // Question - 5
//        int a = 7*49/7+35/7;
//        System.out.println(a);


    }
}
