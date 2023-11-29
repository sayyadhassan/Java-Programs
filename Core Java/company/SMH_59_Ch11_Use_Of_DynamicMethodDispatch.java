package com.company;

class Phone1{
    public void call(){
        System.out.println("Calling");
    }
    public void message(){
        System.out.println("Text Messaging");
    }
}

interface GPS{
    void gpsOn();
    void Location();
}

interface Camera1{
    void takingPicture();
    void recordingVideo();
}

// Class SmarPhone1 extending Class Phone1 and Implementing Interfaces GPS and Camera
class SmartPhone1 extends Phone implements GPS,Camera1{
    public void gpsOn(){
        System.out.println("GPS is ON");
    }
    public void Location(){
        System.out.println("Location is tracking");
    }
    public void takingPicture(){
        System.out.println("Image capturing");
    }
    public void recordingVideo(){
        System.out.println("Video is recording");
    }
}

public class SMH_59_Ch11_Use_Of_DynamicMethodDispatch {
    public static void main(String[] args) {
        Camera1 c = new SmartPhone1();    // Use only the functionality of Camera otherwise got error
//        c.call();         // Not allowed
//        c.gpsOn();        // Not allowed
//        c.Location();     // Not allowed

        c.takingPicture();   // Allowed
        c.recordingVideo();  // Allowed
    }
}
