package com.company;

public class SMH_32_Ch7_StaticLocalVariable {
    static int a =5;
    void fun(){
//        static int a =5;       Give error because inside any non-static function we can't declare static members
         int b =5;
        System.out.println(a);
//        System.out.println(b);
        a +=1;
//        b +=1;
    }

    public static void main(String[] args) {
        SMH_32_Ch7_StaticLocalVariable obj = new SMH_32_Ch7_StaticLocalVariable();
        for(int i=0;i<=3;i++){
            obj.fun();
        }
    }
}
