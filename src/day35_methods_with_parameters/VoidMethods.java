package day35_methods_with_parameters;

/**
 *methods
 */

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        displayUSFlag();

    }

    public static void printAtoZ() {

        char letter = 'A';

        while (letter <= 'Z') {
            System.out.print(letter + " , ");
            letter++;

        }
        System.out.println();

    }

        public static void displayUSFlag() {
            System.out.println("-----------FLAG OF USA------------");
            String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
            String p2 = "==============================================";
            for (int i = 0; i < 4; i++) {
                System.out.println(p1);
            }
            System.out.println("* * * * * * ==================================");
            for (int i = 0; i < 6; i++) {
                System.out.println(p2);
            }
        }


    public static class MethodsWithInputs {
        public static void main(String[] args) {
            displayValue(50);
            displayValue(61);
            displayValue(105);
            int count = 55;
            displayValue(count);
            int number = 85;
            displayValue(number);
            greetByName("Anna!");
            String name = "Suleyman!";
            greetByName(name);

        }
        public static void displayValue(int num) {
            System.out.println("Value is - " + num);
        }

       public static void greetByName (String name ){
           System.out.println("Hello, my name is - " + name + " Nice to meet you!" );
       }

        }
}




