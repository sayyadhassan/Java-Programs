package Interview_Practice_Question.String;

public class Question09_String_RemoveWhiteSpaces {
    public static void main(String []args){
        String str = "Sayyad Mohammad Hassan";
        int n = str.length()-1;
        char currChar;
        String newStr = "";
        for(int i=0;i<=n;i++){
            currChar = str.charAt(i);
            if(currChar == ' '){
                newStr += str.charAt(i+1);
                i++;
            }
            else {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
