package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
     //   String word = "java is fun";

     //   System.out.println(word.substring(0,4)); // java....end index is not included
     //   System.out.println(word.substring(0, 7)); // java is
      //  System.out.println(word.substring(5, 7)); // is
      //  System.out.println(word.substring(8)); // fun
     //   System.out.println(word.substring(5)); // is fun

        String word1 = "hello world!";

        System.out.println(word1.charAt(11));
        System.out.println(word1.length()); //12
        System.out.println(word1.substring(0,5).length());
        System.out.println(word1.indexOf("o"));



    }
}
