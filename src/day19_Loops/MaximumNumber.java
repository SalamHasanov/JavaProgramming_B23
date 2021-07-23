package day19_Loops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //  whatever user enters will be larger than -2147483648

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter a number:");
            int n = scan.nextInt();

            if (n > max){ //if the user entered number is greater than the max value
                max = n; // then user entered number will be assigned to max variable


            }


        }
        System.out.println("maximum number is:"+max);
    }
}
