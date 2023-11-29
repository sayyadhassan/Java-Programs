package com.company;

class Cylinder{
    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public int getH() {
        return h;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double surfaceArea(){
        return  2*3.14*r*h+2*3.14*r*r;
    }

    public double volume(){         // 3.14 can be written as Math.PI
        return Math.PI*r*r*h;
    }

    public Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }
}

public class SMH_44_Ch9_Practice_Set {
    public static void main(String[] args) {
//        // Question - 1 Create a class Cylinder and use getter and seter to set its redius and height
//        Cylinder c = new Cylinder();
//        c.setR(4);
//        c.setH(3);
////        System.out.println("Radius of Cylinder is : "+c.getR());
////        System.out.println("Height of Cylinder is : "+c.getH());
//
//        // Question - 2 Use question one to calculate Surface Area and Volume of Cylinder
//        System.out.println("Surface area of Cylinder is : "+c.surfaceArea());
//        System.out.println("Volume of Cylinder is : "+c.volume());

        // Question - 3 Use Constructor and repeate question one
        Cylinder c = new Cylinder(9,12);
        System.out.println("Radius of Cylinder is : "+c.getR());
        System.out.println("Height of Cylinder is : "+c.getH());
        System.out.println("Surface area of Cylinder is : "+c.surfaceArea());
        System.out.println("Volume of Cylinder is : "+c.volume());
    }
}
