package Shradha.DSA;

      // Print string in reverse order using recursion

public class DSA_03_Shradha_Recursion_reverseString {
    public static void ReverseString(int lastIndex,String str){
        str = str.toUpperCase();
        if(lastIndex==0){
            System.out.println(str.charAt(lastIndex));
            return;
        }
        System.out.print(str.charAt(lastIndex)+" ");
        ReverseString(lastIndex-1,str);
    }


    public static void main(String[] args) {
        String str = "Hassan";
        int i = str.length()-1;
        ReverseString(i,str);
    }
}
