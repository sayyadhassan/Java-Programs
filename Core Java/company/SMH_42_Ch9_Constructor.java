package com.company;

class MyEmployees{
    protected int id;
    protected String name;

      MyEmployees(){
         id = 4;
        name = "Hassan";
    }
       MyEmployees(String n){
         id = 4;
        name = n;
    }
       MyEmployees(String n,int i){
         id = i;
        name = n;
    }


//    public void setName(String n){      // Don't need
//        name = n;
//    }

    public String getName(){
        return name;
    }

//    protected void setId(int i){      // Don't need
//        id = i;
//    }

    public int getId(){
        return id;
    }
}
public class SMH_42_Ch9_Constructor {
    public static void main(String[] args) {
        MyEmployees m = new MyEmployees();             // Constructor overloading is same as function Overloading.
        MyEmployees a = new MyEmployees("Jubair");  // Constructor can be overloaded by creating multiple object.
        MyEmployees b = new MyEmployees("Naveen",5);

        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(b.getId());
        System.out.println(b.getName());

    }
}
