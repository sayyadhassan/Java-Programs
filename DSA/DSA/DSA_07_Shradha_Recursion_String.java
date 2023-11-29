package Shradha.DSA;

// Question : Remove duplicate in a string     (56:00 video time)
// Example : "abbccda"  ->  "abcd"

public class DSA_07_Shradha_Recursion_String {
    public static boolean []map = new boolean[26];
    public static void removeDuplicate(String str,int index,String newString){
        if(index == str.length()-1){
            System.out.println("New String : "+newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            removeDuplicate(str,index+1,newString);
        }
        else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str,index+1,newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        System.out.println("Original String : "+str);
        removeDuplicate(str,0,"");
    }
}
