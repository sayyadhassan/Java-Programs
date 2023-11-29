package com.company;

//                    Thread by implementing Runnable Interaface

class One implements Runnable{
    synchronized public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread of A "+i);
        }
    }
}
class Second implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread of B "+i);
        }
    }
}

public class SMH_67_37_Saurabh_ThreadByRunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new One());
        Thread t2 = new Thread(new Second());
        t1.start();
        t2.start();
    }
}

// Note: We can't override multiple run() method in same class
