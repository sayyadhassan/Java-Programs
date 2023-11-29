package Shradha.DSA;

         // Find first and laste occurance of character in String
public class DSA_04_Shradha_Recursion_String {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str,int index,char element){
        if(index == str.length()){
            System.out.println("First occurance at index "+first);
            System.out.println("Last occurance at index "+last);
            return;
        }
        if(str.charAt(index) == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findOccurance(str,index+1,element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaha";
        char ch = 'a';
        findOccurance(str,0,ch);
    }
}
