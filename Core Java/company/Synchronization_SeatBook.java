package com.company;

                 // Seat book program in threater without Synchronization

class BookSeats2{
    int total_seats = 9;
    synchronized void bookSeat(int seats){
        if(total_seats >= seats){
            System.out.println(seats+" Seats book successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats left "+total_seats);
        }
        else {
            System.out.println("Seat can't be booked");
            System.out.println("Available seats "+total_seats);
        }
    }
}
public class Synchronization_SeatBook extends  Thread {
    static BookSeats2 b = new BookSeats2();
    int seats;

    public  void run(){
        b.bookSeat(seats);
    }

    public static void main(String []args){
        // Thread 1
        Synchronization_SeatBook Javed = new Synchronization_SeatBook();
        Javed.seats = 7;
        Javed.start();
//        Javed.start();    // Will generate illegal thread exception

        // Thread 2
        Synchronization_SeatBook Majid = new Synchronization_SeatBook();
        Majid.seats = 7;
        Majid.start();
    }
}
