package Interview_Practice_Question.String;

public class Question01_String_Reverse_String {
    public static void main(String []args){
        String str = "Hassan";
        int length = str.length()-1;

        // Will only print String in reverse order
        for(int i = length;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        // Convert whole String into new Strig after reversing it
        String newString ="";
        for(int i = length;i>=0;i--){
            newString += str.charAt(i);
        }
        System.out.println(newString);
    }
}
