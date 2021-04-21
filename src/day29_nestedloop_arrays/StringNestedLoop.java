package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        //  0123
        String word = "java";                     // or use <= BUT then do .length()-1
        for (int i = 0; i < word.length(); i++) { // cannot use "=" because length counts
            // from 1 and we need to count from 0 only (otherwise "out of bound"
            for (int j = 0; j <= i; j++) {
                //  System.out.println(word.charAt(i));
                System.out.print(word.charAt(j));

            }
            System.out.println();
        }

        String word1 = "Java"; ///print reverse
        for (int i = 0; i < word1.length(); i++) {
            for (int j = i; j < word1.length(); j++) {

                System.out.print(word1.charAt(j));

            }
            System.out.println();// new line after inner loops
        }
    }}
