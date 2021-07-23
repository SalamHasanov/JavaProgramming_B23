package day20_Loops;

public class CatsAndDogs {
    public static void main(String[] args) {
        String sentence = "Cat Dog Dog Cat";

        int nubmerOfCats = 0;
        int numberOfDogs = 0;

        for (int i = 0; i < sentence.length()-3; i++) {
            String each = sentence.substring(i, i+3);
            if (each.equals("Cat")){
                nubmerOfCats++;
            }
            if (each.equals("Dog")){
                numberOfDogs++;
            }

        }
        System.out.println("numberOfDogs = " + numberOfDogs);
        System.out.println("nubmerOfCats = " + nubmerOfCats);
        boolean equal = nubmerOfCats == numberOfDogs;
        System.out.println("equal = " + equal);
    }
}
