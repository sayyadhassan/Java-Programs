package com.company;

import java.util.Scanner;

public class DSA_Faraz_Ep5_Recursion {
    public static boolean isPalidrome(int l,int r,String s){
        if(l>=r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalidrome(l+1,r-1,s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the String");
        String s = sc.next();
        int l=0;
        int r=s.length()-1;
        boolean b = isPalidrome(l,r,s);
        if(b){
            System.out.println("String is Palidrome");
        }
        else {
            System.out.println("String is not Palidrome");
        }

    }
}
