package Shradha.DSA;

public class DSA_Shradha_Rough {
    static boolean []map = new boolean[25];
    public static void removeDuplicate(int index,String str,String newStr){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            removeDuplicate(index+1,str,newStr);
        }
        else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(index+1,str,newStr);
        }
    }

    public static void main(String []args){
        String str="abacdccddef";
        removeDuplicate(0,str,"");
    }
}
