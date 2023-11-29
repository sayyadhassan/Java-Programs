package com.company;

import org.w3c.dom.ls.LSOutput;

public class SMH_10_Ch2_ResultingDataType {
    public static void main(String[] args) {

        byte x = 5;
        short y = 4;
        System.out.println(x + y);

        char c = 'b';
        int a = 2;
        System.out.println(c+a);   // Here 'b' is converted into ASCII Code then perform operation
        System.out.println(c);

        long l = 455456554544445l;
        char D = 'a';
        System.out.println(l+D);

     /*   char d = 'B';
        System.out.println(d++);
        System.out.println(d);

        // Increment and Decrement Operator
        int i=54;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        int j =56;
        int b = j++;  // First j is assigned to b then increment
        int c = 58;
        int d = ++c;  // First c is assigned ot d then increment     */
    }

}
