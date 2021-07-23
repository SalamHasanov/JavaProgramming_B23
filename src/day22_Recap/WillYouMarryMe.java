package day22_Recap;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer = "";
        System.out.println("Will you marry me?");
        answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.out.println("Invalid Entry, please re-enter");
            answer = scan.next();
}



            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Congrats");
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("RIP");
            }
        }
    }



