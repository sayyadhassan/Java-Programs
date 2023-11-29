package Interview_Practice_Question.String;

import java.util.Scanner;

public class Question10_String_Remove_Duplicacy {
    public static void main(String []args){
        String str;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        boolean []arr = new boolean[127];
        String newstr ="";
        for(int i=0;i<str.length();i++){
            if(!arr[str.charAt(i)]){
                newstr += str.charAt(i);
                arr[str.charAt(i)] = true;
            }
        }

        System.out.println("String with duplicate elements "+str);
        System.out.println("String without duplicate elements "+newstr);
    }
}
