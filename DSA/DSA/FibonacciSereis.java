package Shradha.DSA;

public class FibonacciSereis {
    static void printFibonace(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFibonace(b,c,n-1);
    }
    public static void main(String []args){
        int n=7;
        int a =1;
        int b=2;
        System.out.print(a+" ");
        System.out.print(b+ " ");
        printFibonace(a,b,n-2);
    }
}
