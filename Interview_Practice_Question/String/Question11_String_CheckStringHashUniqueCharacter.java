package Interview_Practice_Question.String;

public class Question11_String_CheckStringHashUniqueCharacter {
    public static void main(String []args){
        String str = "abcdefjh";

        int []arr = new int [127];
        boolean isDuplicate = false;
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;

            if(arr[str.charAt(i)] > 1){
                isDuplicate = true;
                break;
            }
        }

        if(isDuplicate){
            System.out.println("String has Duplicate value");
        }
        else {
            System.out.println("String has unique character");
        }
    }
}
