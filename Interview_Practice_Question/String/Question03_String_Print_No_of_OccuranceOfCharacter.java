package Interview_Practice_Question.String;

import java.util.Scanner;

 // Print number of occurance of character in a String
 // Also remove duplicate in a String

public class Question03_String_Print_No_of_OccuranceOfCharacter {
    public static void main(String []args){
        int []arr = new int[127];
        Scanner sc = new Scanner(System.in);
        String str = sc.next();    // aabbccc

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;
        }

        // Remove Duplicate from String
        boolean []arr1 = new boolean[127];
        String newString = "";
        for(int i=0;i<str.length();i++){
            if(!arr1[str.charAt(i)]){
                newString += str.charAt(i);
                arr1[str.charAt(i)] = true;
            }
        }
        System.out.println("New String "+newString);

        for(int i=0;i<newString.length();i++){
            System.out.println(newString.charAt(i)+" comes "+arr[newString.charAt(i)]);
        }
    }
}
