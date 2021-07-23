package day09_ifStatements;

public class PassOrFail {
    public static void main(String[] args) {
        int score = 50;

        if (score >= 60) {
            System.out.println("passed");
        }
        if (score < 60) {
            System.out.println("failed");
        }
        System.out.println("_________________________");

        if (score < 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }
}
