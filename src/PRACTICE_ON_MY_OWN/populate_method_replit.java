package PRACTICE_ON_MY_OWN;

/**
 * The populate method accepts an empty int array and populates it with numbers counting up.
 *
 * Example:
 *
 * populate(new int[3])
 *
 * returns:[1,2,3]

 * populate(new int[5])
 *
 * returns:[1,2,3,4,5]
 *
 * hint:
 *
 * use a for loop and use the iterator as the current elements value.
 */

public class populate_method_replit {
    public static void main(String[] args) {

    }

    public static int [] populate(int [] r) {

        for(int i = 0; i <= r.length; i++) {
            r[i-1] = i; // will give you index 0 ------
        }
        return r;





    }
}
