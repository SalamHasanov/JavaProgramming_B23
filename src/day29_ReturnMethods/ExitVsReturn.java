package day29_ReturnMethods;

public class ExitVsReturn {

    public static void passOrFailed (int score){
        if (score < 0 || score > 100){
            System.out.println("Invalid");
            return;

        }

        if (score >= 60){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
