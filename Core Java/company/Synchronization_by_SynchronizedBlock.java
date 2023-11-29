package com.company;

class TotalEarning extends Thread{
    int total = 0;

    @Override
    public void run(){
        synchronized (this){
            for(int i=0;i<=9;i++){
                total = total + 90;
            }
            this.notify();
        }
    }

}

public class Synchronization_by_SynchronizedBlock {
    public static void main(String []args) throws InterruptedException {
        TotalEarning te = new TotalEarning();
        te.start();

        System.out.println(te.total);  // total value may be wrong here due to uncompletion of for-loop

        synchronized (te){
            te.wait();
            System.out.println("Total Earning "+te.total);
        }

    }
}
