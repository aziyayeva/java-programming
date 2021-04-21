package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {

        for( int minuted = 1; minuted <= 5; minuted++) {
            System.out.println("\nMinutes= " + minuted);
            for( int seconds = 1; seconds <= 60; seconds++) {
                System.out.print( seconds + " ");
            }

        }

        for(int minutes = 0; minutes <= 4; minutes++) {
            for (int seconds = 0; seconds <=59; seconds++) {
                System.out.println(minutes + ":" + seconds );
            }
        }

    }
}
