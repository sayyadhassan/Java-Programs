package Interview_Practice_Question.Array;

public class Question08_Print_Pallidrome {
    public static void main(String []args){
        int no = 282;
        int temp = no;
        int rev_no =0, rem;
        while(temp !=0){
            rem = temp%10;
            rev_no = rev_no * 10 + rem;
            temp = temp/10;
        }
        if(rev_no == no){
            System.out.println("No. is pallidrome");
        }
        else {
            System.out.println("No. is not pallidrome");
        }
    }
}
