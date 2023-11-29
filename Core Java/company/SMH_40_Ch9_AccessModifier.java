package com.company;
class MyEmployee{
    protected int id;
    protected String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    protected void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class SMH_40_Ch9_AccessModifier {
    public static void main(String[] args) {
        MyEmployee m = new MyEmployee();
//        m.name = "Hassan";    // If they will protected then can be accessible
//        m.id=88;             // They can't be accessible due to private

        m.setId(78);
        System.out.println(m.getId());
        m.setName("Hassan");
        System.out.println(m.getName());
    }
}
