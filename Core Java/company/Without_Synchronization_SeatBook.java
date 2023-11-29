package com.company;

// Seat book program in threater without Synchronization

class BookSeats{
    int total_seats = 9;
    void bookSeat(int seats){
        if(total_seats >= seats){
            System.out.println(seats+" Seats book successfully");
            total_seats = total_seats -  seats;
            System.out.println("Seats left "+total_seats);
        }
        else {
            System.out.println("Seat can't be booked");
            System.out.println("Available seats "+total_seats);
        }
    }
}
public class Without_Synchronization_SeatBook extends Thread {
   static BookSeats b = new BookSeats();
   int seats;
    public  void run(){
        b.bookSeat(seats);
    }
    public static void main(String []args){
        // Thread 1
        Without_Synchronization_SeatBook Javed = new Without_Synchronization_SeatBook();
        Javed.seats = 7;
        Javed.start();

        // Thread 2
        Without_Synchronization_SeatBook Majid = new Without_Synchronization_SeatBook();
        Majid.seats = 7;
        Majid.start();
    }
}
