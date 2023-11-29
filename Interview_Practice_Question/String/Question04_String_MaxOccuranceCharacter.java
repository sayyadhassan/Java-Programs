package Interview_Practice_Question.String;

public class Question04_String_MaxOccuranceCharacter {
    public static void main(String []args){
        int []arr = new int[200];
        String str = "abbckdddfffff";

        int max =0;
        char ch =' ';
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;
                if(max<arr[str.charAt(i)]){
                    max = arr[str.charAt(i)];
                    ch = str.charAt(i);

        }
        }
        System.out.println("Maximum occurance of Character is "+ch);
    }
}
