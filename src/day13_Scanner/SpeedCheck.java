package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        int speedLimit = 55;
        System.out.println("Enter your current speed: ");
        int currentSpeed = new Scanner(System.in).nextInt();

        int overSpeedLimit = currentSpeed - speedLimit;
        if (overSpeedLimit > 0){
            System.err.println("You are driving "+ overSpeedLimit + " miles over speed limit. Slow Down!");
        }

    }
}
