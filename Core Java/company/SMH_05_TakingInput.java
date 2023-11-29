package com.company;
import java.util.Scanner;
public class SMH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 2 values");
        int a = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a + b;

        System.out.println("Sum of these no. is "+sum);
     //   boolean b2 = sc.hasNextInt();  //  It is used to check validity of entering data depend on variable data type

     //   System.out.println(b2);     /* If enter data is correct according to data type then it print 'true' otherwise 'false
        System.out.println("Enter first name");
        String str = sc.next();       //  For single word
        System.out.println("Enter second name");
        String str2 = sc.nextLine();  // For multiple word
        System.out.println(str);
        System.out.print(str2);
    }
}
