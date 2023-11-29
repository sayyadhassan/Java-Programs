package Interview_Practice_Question.String;

import java.util.Arrays;

public class Question17_Check_Anagram {
    public static void main(String []args){
        String str1 ="silent";
        String str2 = "lisssten";

        char []charArry1 = str1.toCharArray();
        char []charArry2 = str2.toCharArray();

        Arrays.sort(charArry1);
        Arrays.sort(charArry2);


        if(Arrays.equals(charArry1,charArry2)){
            System.out.println("String is anagram");
        }
        else {
            System.out.println("String is not anagram");
        }

    }
}
