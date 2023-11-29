package Shradha.DSA;

public class Pallidrome_Number {
    public static void main(String []args){
        int no = 282;
        int temp = no;
        int rev_no =0, rem;

        while(temp !=0){
            rem = temp % 10;
            rev_no = rev_no * 10 + rem;
            temp = temp/10;
        }

        if(no == rev_no){
            System.out.println("Number is pallidrome");
        }
        else {
            System.out.println("Number is not pallidrome");

        }
        System.out.println(2%10);  // Print reminder 2
    }
}
