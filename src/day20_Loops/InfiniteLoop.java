package day20_Loops;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        for (int i = 0;;) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();
            if (n < 0){
                break;
            }
            result += n;

        }
        System.err.println("You Entered a negative number");
        System.out.println("result = " + result);
        scan.close();
    }
}
