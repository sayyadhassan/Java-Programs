package Interview_Practice_Question.Array;

public class Question14_Integer_ReverseNo {
    public static void main(String []args){
        int number = 289;

        int reverseNo=0;
        while (number!=0){
            int reminder = number % 10;
            reverseNo = reverseNo * 10 + reminder;
            number = number/10;
        }

        System.out.println(reverseNo);
    }
}
