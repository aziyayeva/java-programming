package day25_loops;

public class PrintStars {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
       //     System.out.println("*");
        }

        int count = 5;


        for(int i=0; i < count; i++) {

            for(int k=0; k < count; k++) {
                System.out.print("* * * * ");
                for (int l=0; l < count; l++) {
                    System.out.print("---");
                }
            }

            System.out.println();
        }

        System.out.println();
        String myStars = "";

        for(int stars = 1; stars <= 5; stars ++ ) {
            myStars += "*";
        }

    }
}


