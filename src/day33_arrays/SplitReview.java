package day33_arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajavaajav";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length;
        System.out.println("countofA = " + countOfA);

    }
}
