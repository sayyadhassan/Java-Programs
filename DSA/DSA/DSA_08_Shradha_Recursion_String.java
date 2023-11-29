package Shradha.DSA;

// Question : Print all the subsequences of a string
// Example : "abc"  -->  "abc","ab","ac","a","bc","b","c"," "

public class DSA_08_Shradha_Recursion_String {
    public static void subSequences(String str,int index,String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);

        // to be
        subSequences(str,index+1,newString+currChar);

        // not to be
        subSequences(str,index+1,newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str,0,"");
    }
}
