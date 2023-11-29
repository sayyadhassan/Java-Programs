package com.company;

class TotalEarning2 extends Thread{
    int total=0;
    int ticket;
    public void run(){
        synchronized (this){
            for(int i=1;i<=ticket;i++){
                total += 200;
            }
            this.notify();
        }
    }
}

public class Synchronization02_by_SynchronizedBlock  {
    public static void main(String []args) throws InterruptedException{
        TotalEarning2 vendor = new TotalEarning2();
        vendor.ticket = 5;
        vendor.start();
//        System.out.println("Total earnign is "+ vendor.total);

        synchronized(vendor){
            vendor.wait();
            System.out.println("Total Earning of Vendoe "+vendor.total);
        }

        TotalEarning2 vendor2 = new TotalEarning2();
        vendor2.ticket = 6;
        vendor2.start();

        synchronized (vendor2){
            vendor2.wait();
            System.out.println("Total earning of Vendor2 is "+vendor2.total);
        }
    }
}
