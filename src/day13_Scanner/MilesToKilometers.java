package day13_Scanner;
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;

        System.out.println(miles+ " is equal to "+ kilometers+ " kilometers");
    }
}
