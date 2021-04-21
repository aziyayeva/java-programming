package day31_arrays;

public class CharArray {
    public static void main(String[] args) {

        //char array with following values:
        char [] characters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};

        for( char each : characters) {
            System.out.print(each + " ");

        }
        String sentence = new String(characters);
        System.out.println("\nSentence = " + sentence);

        String item = "Wooden Spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("item.Array.length = " + itemArray.length); //array length does not have ()
        System.out.println( "item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        String fruitStr = "";
        for(String each : fruits ) {
           // System.out.print(each + "-");
            fruitStr += each + "-";

        }
        System.out.print(fruitStr);

        String [] languages = {"java" , "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("", languages));
        System.out.println(String.join("##", languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);


    }
}
