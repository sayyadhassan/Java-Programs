package Shradha.DSA;

import java.util.Scanner;

public class ReverseString {
    public static void main(String []args){
        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
