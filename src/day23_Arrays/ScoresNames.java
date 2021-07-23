package day23_Arrays;

public class ScoresNames {
    public static void main(String[] args) {
        int[] scores = {85, 70, 95, 90, 100};

        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};

        int maxScore = scores[0];
        String maxName = "";

        int minScore = scores[0];
        String minName = "";

        for (int i=0; i <= names.length-1 ; i++) {
            String eachName = names[i]; // gets each names from the array names
            int eachScore = scores[i]; // gets each score from the array scores


            if (eachScore > maxScore){ // used for comparing the scores to assign the maximum score to max
                maxScore = eachScore;  //
                maxName = eachName;
            }
            if (eachScore < minScore){
                minScore = eachScore;
                minName = eachName;
            }

        }
        System.out.println("maxName = " + maxName);
        System.out.println("maxScore = " + maxScore);
        System.out.println("minName = " + minName);
        System.out.println("minScore = " + minScore);
    }
}
