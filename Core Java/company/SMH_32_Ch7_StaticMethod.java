package com.company;

public class SMH_32_Ch7_StaticMethod {

        // static variable
        static int a = 40;     // static member variable or class variable
        // instance variable
        int b = 50;           // instance member variable or local variable

        // non-static method
        void simpleDisplay(){
            System.out.println(a);
            System.out.println(b);
        }

        // static method
        static void staticDisplay(){
            System.out.println(a);
//            System.out.println(b);  // can't accessiable because 'b' is instance membare variable
        }


    public static void main(String[] args) {
         SMH_32_Ch7_StaticMethod obj = new SMH_32_Ch7_StaticMethod();
         obj.simpleDisplay();

         // calling staticDisplay
        staticDisplay();
    }
}
