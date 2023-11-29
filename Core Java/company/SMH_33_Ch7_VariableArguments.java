package com.company;

public class SMH_33_Ch7_VariableArguments {
    // Traditional methods
//    static int add(int a,int b){
//        return a+b;
//    }
//    static int add(int a,int b,int c){
//        return a+b+c;
//    }
//    static int add(int a,int b,int c,int d){
//        return a+b+c+d;
//    }


    static int add(int...arr){
//     Available here as int []arr
        int result =0;
        // Using for-loop
        for(int i=0;i<arr.length;i++){
            result += arr[i];
        }
        // Using for-each-loop
//        for(int element : arr){
//            result +=element;
//        }
        return result;
    }


    // Here we need to pass atleast one argument
//    static float add(int x,float...arr){
//        float result = x;
//        for(float e : arr){
//            result +=e;
//        }
//        return result;
//    }


    public static void main(String[] args) {
//        System.out.println("The sum of  nothing is : "+add());    // for only first add method, if we use this for second add method then it will give error
//        System.out.println("The sum of 4  is : "+add(4));
//        System.out.println("The sum of 4 and 5 is : "+add(4,5));
        System.out.println("The sum of 4,5 and 6 is : "+add(4,5,6));
//        System.out.println("The sum of 4,5,6 and 7 is : "+add(4,5.5f,6.6f,7.3f));
//        System.out.println("The sum of 4 and 5 is : "+add(4,5));
//        System.out.println("The sum of 4 and 5 is : "+add(4,5));

    }
}
