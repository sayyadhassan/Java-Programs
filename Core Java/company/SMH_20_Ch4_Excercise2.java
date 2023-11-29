package com.company;
import java.util.Scanner;
import java.util.Random;

public class SMH_20_Ch4_Excercise2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Random rn = new Random();                                                 // 1 - Rock
//        System.out.println("User 1 please enter a number between 1 to 3");       // 2 - Secisor
//        int a = sc.nextInt();                                                   // 3 - Paper
//        System.out.println("User 2 please enter a number between 1 to 3");
//        int b = sc.nextInt();
//        System.out.println("User 3(Computer) please enter a number between 1 to 3");
        int min =20;
        int max =40;
        int c = rn.nextInt(max-min)+min;
        System.out.println(c);

//        if(a==1 && b==2 && c==3){
//            System.out.println("User 1 won");
//        }
//        else if (a==1 && b==3 && c==2){
//            System.out.println("User 1 won");
//        }
//        else if(a==2 && b==1 && c==3){
//            System.out.println("User 2 won");
//        }
//        else if(a==2 && b==3 && c==1){
//            System.out.println("User 3 won");
//        }
//        else if(a==3 && b==1 && c==2){
//            System.out.println("User 2 won");
//        }
//        else if(a==3 && b==2 && c==1){
//            System.out.println("User 3 won");
//        }
//        else if(a==b){
//            System.out.println("Match tie User 1 is equal to User 2");
//        }
//        else if(a==c){
//            System.out.println("Match tie because User 1 is equal to User 3");
//        }
//        else if(b==c){
//            System.out.println("Match tie because User 2 is equal to User 3");
//        }
//        else if (a==b && b==c){
//            System.out.println("Match tie because both are equal");
//        }

    }
}
