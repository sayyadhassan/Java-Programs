package Shradha.DSA;

// Question : Print all combination of keypad

public class DSA_10_Shradha_Recursion_String {
    public static String []map = {".","abc","def","mno","fgh"};
    public static void printSunsequence(String str,int index,String combination){
        if(index >= str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = map[currChar - '0'];
        for(int i=0;i<mapping.length();i++){
            printSunsequence(str,index+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "13";
        printSunsequence(str,0,"");
    }
}
