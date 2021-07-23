package replit_tasks;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        int inputSeconds;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) /60;
        int seconds = inputSeconds % 60;

        scan.close();
        System.out.println(hours+" hours,"+minutes+" minutes, "+"and "+seconds+" seconds");



    }
}
