package com.company;

public class SMH_24_Ch5_break_and_continue {
    public static void main(String[] args) {
        // break statement using 'for loop'
//        for(int i=0;i<9;i++)
//        {
//            System.out.println(i);
//            System.out.println("Helo sir");
//            if(i==6)
//            {
//                System.out.println("Loop is terminated");
//                break;
//            }
//        }

        // break statement using 'while loop'
//        int i=0;
//        while(i<9)
//        {
//            System.out.println(i);
//            System.out.println("Helo sir");
//            if(i==6)
//            {
//                System.out.println("Loop is terminated");
//                break;
//            }
//            i++;
//        }

        // break statement using 'do-while loop'
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Helo sir");
//            if(i==6)
//            {
//                System.out.println("Loop is terminated");
//                break;
//            }
//            i++;
//        }while(i<9);


        // continue statement using 'for loop'
//        for(int i=0;i<9;i++)
//        {
//            if(i==6)
//            {
//                System.out.println("\nContinue is invoked here\n");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Helo sir");
//        }

        // continue statement using 'while loop'
//        int i=0;
//        while(i<9)
//        {
//            i++;
//            if(i==6)
//            {
//                System.out.println("\nContinue is invoked here\n");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Helo sir");
//
//        }

        // continue statement using 'do-while loop'
        int i=0;
        do{
            i++;
            if(i==6)
            {
                System.out.println("\nContinue is invoked here\n");
                continue;
            }
            System.out.println(i);
            System.out.println("Helo sir");
        }while(i<9);
    }
}
