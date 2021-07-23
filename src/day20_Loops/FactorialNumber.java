package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt();
        int result = 1;

        for (int i = number; i >= 1 ; i--) {
            result *= i;

        }
        System.out.println("result = " + result);

    }
}
