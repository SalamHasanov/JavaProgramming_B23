package day15_String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        char f =scan.next().charAt(0);

        System.out.println("Enter your last name:");
        char l = scan.next().charAt(0);
        scan.close();



        String initial = f+ "."+ l;

        System.out.println("initial = " + initial);
    }
}
