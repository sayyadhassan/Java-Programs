package Rough;

class TotalEarning  {
    int total=0;
    int seats;
   synchronized public void calculate(){
        for(int i=0;i<seats;i++){
            total += 200;
        }
        this.notify();
    }
}

public class Rough3 extends Thread {
    public static void main(String []args){
        TotalEarning Vinod = new TotalEarning();
        Vinod.seats = 500;
        Vinod.calculate();
        System.out.println(Vinod.total);

        TotalEarning Rahul = new TotalEarning();
        Rahul.seats = 3;
        Rahul.calculate();
        System.out.println(Rahul.total);
    }
}
