package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number :");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

        System.out.println("Enter your full name:");
        scan.nextLine();
        String fullName = scan.nextLine();

        System.out.println(fullName);
        System.out.println(buildingNumber+" " +streetAddress);
        System.out.println(cityName+" " +state+" "+zipCode);
    }
}
