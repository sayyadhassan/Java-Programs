package com.company;

//                     Thread by using Thread Class
class Exampl extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread of A "+i);
        }
    }
}
class Exampl2 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread of B "+i);
        }
    }
}

public class SMH_67_38_Saurabh_Thread_By_ThreadClass {
    public static void main(String[] args) {
        Thread e1 = new Exampl();
        Exampl2 e2 = new Exampl2();
        e1.start();
        e2.start();
    }
}
