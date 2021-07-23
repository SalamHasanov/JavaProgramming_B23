package day22_Recap;

import java.util.Scanner;

public class RoomReservationMuhtarsWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println("Welcome to Cybertek Hotel");
        System.out.println("Would you like to reserve a room?");
        String answer = scan.next().toLowerCase();

        while (! (answer.equals("yes")) || answer.equals("no")) {
            System.out.println("Would you like to reserve a room?");
            answer = scan.next().toLowerCase();
        }

    }
}
