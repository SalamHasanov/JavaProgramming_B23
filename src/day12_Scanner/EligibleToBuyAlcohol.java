package day12_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        if (age>=21){
            System.out.println("You are eligible to buy alcohol"
            );}else {
            System.out.println("Get out!");
        }

    }
}
