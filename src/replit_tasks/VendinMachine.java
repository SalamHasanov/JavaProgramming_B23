package replit_tasks;

import java.util.Scanner;

public class VendinMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int num = scan.nextInt();
        int cents;
        int quarters = num / 25;
        int remainder = num%25;
        int dimes = remainder/10;
        int remainder2 = remainder%10;
        int nickels = remainder2 / 5;
        int remainder3 = remainder2%5;
        int pennies = remainder3/1;

        if (num > 100){
            System.out.println("Invalid cents amount");
        }else {

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + "and " + pennies + " pennies");
        }
        }
}
