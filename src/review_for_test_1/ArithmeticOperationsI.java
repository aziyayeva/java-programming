package review_for_test_1;

public class ArithmeticOperationsI {
    public static void main(String[] args) {

        String word1 = "jv";
        String word2 = "mouse";
        String word3 = "st";
        String longestWord = "";
        int amount = 0;

        if(word1.contains("a")) {
            if(word1.length() > longestWord.length()) {
                longestWord = word1;
            }
        } else {
            amount += 1;
        }

        if(word2.contains("a")) {
            if(word2.length() > longestWord.length()) {
                longestWord = word2;
            }
        } else {
            amount += 1;
        }

        if(word3.contains("a")) {
            if(word3.length() > longestWord.length()) {
                longestWord = word3;
            }
        } else {
            amount += 1;
        }
        System.out.println("longestWord = " + longestWord);
        System.out.println(amount);


    }

}
