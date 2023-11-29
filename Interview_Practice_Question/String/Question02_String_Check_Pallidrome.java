package Interview_Practice_Question.String;
import java.util.Scanner;

 //  Check String is Pallidrome of not.
 // Pallidrome - abcba

public class Question02_String_Check_Pallidrome {
    public static void checkPallidrom(int firstIndex,int lastIndex,String str){
        if(firstIndex>=lastIndex){
            System.out.println("String is Pallidrome");
            return;
        }
        if(str.charAt(firstIndex) == str.charAt(lastIndex)){
            firstIndex++; lastIndex--;
        }
        else{
            System.out.println("String is not Pallidrome");
            return;
        }
        checkPallidrom(firstIndex,lastIndex,str);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int firstIndex =0;
        int lastIndex = str.length()-1;
        checkPallidrom(firstIndex,lastIndex,str);

    }
}
