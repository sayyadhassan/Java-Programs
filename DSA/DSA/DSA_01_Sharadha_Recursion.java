package Shradha.DSA;

public class DSA_01_Sharadha_Recursion {
//
//     Question 1 - Print numbers from 5 to 1 using Recursion
//
//    public static void printNum(int n,int i){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        i++;
//        printNum(n-1,i);
//        System.out.printf("Return from recursion no. %d. ",i);
//    }
//
//     Question 2 - Print sum of first n natural numbers using Recursion
//
//    public static int printSum(int n){
//        if(n == 0){
//            return 0;
//        }
//        int sum = n + printSum(n-1);
//        return sum;
//    }
//
//                 OR
//
//     Sum in Ascending order like-(1+2+3+4+5)
//    public static void printSum(int i,int n,int sum){
//        if(i==n){
//            sum +=i;
//            System.out.println(sum);
//            return;
//        }
//        sum +=i;
//        printSum(i+1,n,sum);
//        System.out.println(i);
//    }
//
//                     OR
//
//     Sum in Descending order like-(5+4+3+2+1)
//      public static void printSum(int n,int sum){
//        if(n==0){
//            System.out.println(sum);
//            return;
//        }
//        sum +=n;
//        printSum(n-1,sum);
//    }
//
//    Question 3 - Print factorial of n using Recursion
//    public static int calculateFactorial(int n){
//        if(n==1 || n==0){
//            return 1;
//        }
//         int fac = n * calculateFactorial(n - 1);
//        return fac;
//    }
//
//     Question 4 - Program to print Fibnocci Sereis upto n no. of terms
//    public static void printFib(int a,int b,int n){
//        if(n==0){
//            return;
//        }
//        int c = a + b;
//        System.out.print(c+" ");
//        printFib(b,c,n-1);
//    }

//                         OR
//     Print Fibnocci Series upto n terms only
    public static void printFib(int a,int b,int n){
        if(b==n){
            return;
        }
        int c;
        c = a+b;
        System.out.println(c);
        printFib(b,c,n);
    }


//     Question 5 - Print x^n (stack height =n)
//    public static int calPow(int x,int n){
//        if(n==0){
//            return 1;
//        }
//        if(x==0){
//            return 0;
//        }
//        int Powmn1 = calPow(x,n-1);
//        int Pow = x * Powmn1;
//        return Pow;
//    }
//
    public static void main(String []args){
//         Question - 1
//        int n =5;
//        int i = 0;
//        printNum(n,i);

//         Question - 2
//        int n = 5;
//        System.out.println(printSum(n));
//
//                      OR
//
//        printSum(1,5,0);        // Sum in Ascending order like-(1+2+3+4+5)
//        printSum(5,0);         // Sum in Descending order like-(5+4+3+2+1)
//
//         Question - 3
//        System.out.println(calculateFactorial(5));

//         Question - 4
        int a =0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        printFib(a,1,7-2);

//         Question - 5
//        int x =2 , n =7;
//        int ans = calPow(x,n);
//        System.out.println(ans);
    }
}

