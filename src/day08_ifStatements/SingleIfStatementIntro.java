package day08_ifStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int score = 90;
        boolean passed = score >= 60;
        if (score >=60){
            System.out.println("Congrats you passed the exam");
        }
        boolean failed = score < 60;
        if (failed) {
            System.out.println("You failed the exam");
        }



    }
}
