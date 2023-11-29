package com.company;
import java.util.Scanner;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void take4KSnap(){
        System.out.println("4k snapping");
    }
    default void record4KVideo(){
        take4KSnap();
        System.out.println("4k video is recording");
    }

    static void staticMeh(){
        System.out.println("I am static method");
    }
}

interface WiFi{
    String []getNetworks();         // NOT CLEAR (Doubt)
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling to : "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends CellPhone implements Camera,WiFi{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String []getNetworks(){                  // NOT CLEAR (Doubt)
        System.out.println("Getting List of Networks");
        String []networkList = {"Hassan","Naveen","Jubair"};
        return networkList;
//        return String.valueOf(networkList);       //   NOT CLEAR (Doubt)
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to : "+network);
    }
     public void record4KVideo(){              // Overrided default method
        System.out.println("4k video is recording (Overrided method of class)");
    }
    public void staticMeh(){
        System.out.println("I am static method of implementation class");
    }
}
public class SMH_57_Ch11_Default_Mehods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String []ar = ms.getNetworks();
        for (String item : ar){
            System.out.println(item);
        }
        ms.takeSnap();
        ms.recordVideo();
        ms.connectToNetwork("Vodafone");
        ms.record4KVideo();
        ms.staticMeh();
    }
}
