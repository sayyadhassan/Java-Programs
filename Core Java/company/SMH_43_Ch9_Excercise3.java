package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int n , i = 0;
    int u;
     Game(){
        Random r = new Random();
        n = r.nextInt(100);
    }
    public void takeUserInput() {
        System.out.println("Enter a no. less than hundered");
        Scanner sc = new Scanner(System.in);
        u = sc.nextInt();

        if (isCorrectNumber()) {
            if (n == u) {
                System.out.println("You enter the correct no. what computer guess : "+n);
                System.out.println("Your score is : "+(100-i*2));
            }
            else if (u < n) {
                i++;
                System.out.println("You enter less no. plese try again");
                takeUserInput();
            }
            else if (u > n) {
                i++;
                System.out.println("You enter greater no. please try again");
                takeUserInput();
            }
        }
    }

    public boolean isCorrectNumber(){
        if(u<100){
            return true;
        }
        else{
            return false;
        }
    }

}

public class SMH_43_Ch9_Excercise3 {
    public static void main(String[] args) {
        Game g = new Game();
        g.takeUserInput();
    }

}
