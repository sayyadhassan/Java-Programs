package Interview_Practice_Question.Array;

public class Question07_Print_Fibonacci_Series {
    public static void printfabo(int a,int b,int n){
        if(n<=0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfabo(b,c,n-1);
    }
    public static void main(String []args){
        int n= 5;
        int a = 1;
        int b= 2;
        System.out.println(a);
        System.out.println(b);
        printfabo(a,b,n-2);
    }
}
