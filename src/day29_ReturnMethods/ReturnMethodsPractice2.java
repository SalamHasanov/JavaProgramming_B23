package day29_ReturnMethods;

public class ReturnMethodsPractice2 {
    public static void main(String[] args) {
        grade(100);
    }

    public static void grade(int score){
        if (score > 100 || score < 0){
            System.out.println("Invalid");
            return;
        }
        if (score >= 90){
            System.out.println("A");
        }else if (score >=80){
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        }else if (score >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
