package Interview_Practice_Question.String;

public class Question02_a_String_Pallidrome_ForLoop {
    public static void main(String []args) {
        String str = "abcrcba";

        int l = str.length()-1;
        boolean isPalidrome = false;
        for(int i=0;i<=l/2;i++){
            if(str.charAt(i) == str.charAt(l-i)){
                isPalidrome = true;
            }
            else {
                isPalidrome = false;
                break;
            }

        }
        if(isPalidrome){
            System.out.println("String is Pallidrome");
        }
        else{
            System.out.println("String is not Pallidrome");
        }
    }
}
