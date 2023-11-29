package com.company;

public class DSA_Faraz_Lt3_Recursion {
    public static int Fibo(int n){
        if(n==0){         // Base condition 1
            return 0;
        }
        if(n==1 || n==2){  // Base condition 2
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);  // Recursion
    }
    public static void main(String[] args) {
        int n =8;
        System.out.println(Fibo(n));
        System.out.println((n-1)+(n-2));
    }
}
