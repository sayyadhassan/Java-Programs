package Interview_Practice_Question.String;

public class Question12_String_FindDuplicateCharacters {
    public static void main(String []args){
        String str = "abccdeefjrrkkh";

        int []arr = new int [127];
        String duplicatChar = "";

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;

            if(arr[str.charAt(i)] > 1){
                duplicatChar += str.charAt(i);
            }
        }

        System.out.println("Duplicate character are "+duplicatChar);
    }
}
