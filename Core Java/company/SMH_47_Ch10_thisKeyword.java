package com.company;

class Example{
    int a, b;
    public void m1(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

public class SMH_47_Ch10_thisKeyword {
    public static void main(String[] args) {
        Example e = new Example();
        e.m1(6,9);
        System.out.println("The value of a : "+e.getA());
        System.out.println("The value of b : "+e.getB());
    }
}
