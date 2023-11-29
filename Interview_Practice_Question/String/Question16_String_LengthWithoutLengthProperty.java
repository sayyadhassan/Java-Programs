package Interview_Practice_Question.String;

public class Question16_String_LengthWithoutLengthProperty {
    public static void main(String []args){
        String str = "Hassan";

        char []charArray = str.toCharArray();

        int length = 0;
        for(char c : charArray){
            length++;
        }
        System.out.println("Length of String is "+length);
    }
}
