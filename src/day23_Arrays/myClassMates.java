package day23_Arrays;

public class myClassMates {
    public static void main(String[] args) {

        //if we know what the elements are
        String[] friends = {"Jonh", "Ahment", "joe"}; //size is 3
        System.out.println("Size:" + friends.length);

        // if we dont know what elements are, but we know how many elements we want to store
        String[] friends2 = new String[5];
        System.out.println("Size: "+friends2.length);

    }
}
