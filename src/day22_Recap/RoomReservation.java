package day22_Recap;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = "";

        double sum = 0;


        do {


        System.out.println("Which bedroom do you want? King/Queen/Single");
        input = scan.next();

        if (input.equalsIgnoreCase("king")) {
            System.out.println("Your reservation price is $120.00");
            System.out.println("Do you want to reserve another room?");
            input = scan.next();
            sum = 120.00;


        }if (input.equalsIgnoreCase("queen")) {
                System.out.println("Your reservation price is $100.00");
                System.out.println("Do you want to reserve another room?");
                input = scan.next();
                sum = 100.00;
            }if (input.equalsIgnoreCase("single")) {
                System.out.println("Your reservation price is $80.00");
                System.out.println("Do you want to reserve another room?");
                input = scan.next();
                sum = 80.00;
            }

        }while( input.equalsIgnoreCase("yes"));
            scan.close();
        System.out.println("Thank you for reserving with us!");
        System.out.println("Your total reservation price is: $"+sum);



    }

}

/*
 write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
 */