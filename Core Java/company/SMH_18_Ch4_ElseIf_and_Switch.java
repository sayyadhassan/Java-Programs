package com.company;
import java.util.Scanner;

public class SMH_18_Ch4_ElseIf_and_Switch {
    public static void main (String []args)
    {
//       // Else-If
//        System.out.println("Enter your age");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age>60){
//            System.out.println("Your are experienced");
//        }
//        else if(age>52){
//            System.out.println("You are semi-semi-experieced");
//        }
//        else if(age>18){
//            System.out.println("You are semi-expeienced");
//        }
//        else{
//            System.out.println("You are not experience");
//        }
//
//
//        // Switch Statement
//        System.out.println("Enter your age");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        switch (age){
//            case 18 :
//                System.out.println("You are going to be adult");
//                break;
//            case 23 :
//                System.out.println("You are ready for job");
//                break;
//            case 60 :
//                System.out.println("You are retired");
//                break;
//            default :
//                System.out.println("Enjoy your life");
//        }

        System.out.println("Enter a string");
        Scanner c = new Scanner(System.in);
        String s = c.next();
        switch (s){
            case "Hassan" :
                System.out.println("Your name is Hassan");
                break;
            case "Naveen" :
                System.out.println("Your name is Naveen");
                break;
            case "Jubair" :
                System.out.println("Your name is Jubair");
                break;
            default:
                System.out.println("Who are you");
        }

        // Enhanced Switch
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A' -> System.out.println("'A' for apple");
            case 'B' -> System.out.println("'B' for ball");
            case 'C' -> System.out.println("'C' for cat");
            case 'D' -> System.out.println("'D' for dog");
            default -> System.out.println("What you want ");
        }
    }
}
