package Shradha.DSA;

// Qusetion : Print all unique subsequences of a string
// Example : "aaa" --> "aaa","aa","a"," "

import java.util.HashSet;

public class DSA_09_Shradha_Recursion_String {
    public static void subSequences(String str,int index,String newString,HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);

        // to be
        subSequences(str,index+1,newString+currChar,set);

        // not to be
        subSequences(str,index+1,newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSequences(str,0,"",set);
    }
}
