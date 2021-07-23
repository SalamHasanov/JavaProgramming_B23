package day26_MultiDimensionalArrays;

public class CommonElements {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};

        for (int elements2ndArray :
                arr2) {


        for (int elements1stArray :
                arr1) {
            if (elements1stArray == elements2ndArray) {
                System.out.println(elements1stArray);
            }
        }
        }
        System.out.println("_____________________________________");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]){
                    System.out.println(arr2[i]);
                }
            }

        }

    }
}
