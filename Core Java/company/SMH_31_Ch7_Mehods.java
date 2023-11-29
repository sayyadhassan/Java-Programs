package com.company;

public class SMH_31_Ch7_Mehods {
    static int logic(int x,int y){
        int sum;
        if(x>y){
             sum=x+y;
        }
        else{
            sum=(x+y)*5;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=5;
        int b=8;
        // Method invocation by creating object
//        SMH_31_Ch7_Mehods ob = new SMH_31_Ch7_Mehods();
//        int c=ob.logic(a,b);
        int c=logic(a,b);
        System.out.println(c);

        int a1=4;
        int b1=2;
        int c1=logic(a1,b1);
        System.out.println(c1);
    }
}
