package com.company;

public class SMH_14_String_Immutabilty {
    public static void main(String[]args){
        String s1 = new String("Hassan");
        s1=s1.concat("Saikh");
        System.out.println(s1.length());
        s1.replace("Hassan","Mohammad");

        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("Hassan");
        s2.append("Saikh");
        s2.delete(2,4);
        System.out.println(s2);
    }
}
