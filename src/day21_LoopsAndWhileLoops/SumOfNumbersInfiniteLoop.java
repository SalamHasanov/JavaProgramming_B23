package day21_LoopsAndWhileLoops;

import java.util.Scanner;

public class SumOfNumbersInfiniteLoop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.println("Enter a number:");
            int n = scan.nextInt();


            if(n < 0){
                System.err.println("You entered a negative number!");
                break;
            }
            sum += n;

        }
        System.out.println("sum = " + sum);
        scan.close();

    }
}
