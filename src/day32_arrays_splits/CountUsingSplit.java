package day32_arrays_splits;

public class CountUsingSplit {
    public static void main(String[] args) {

        String catTypes = "bengal cat tabby cat persian cat not cat here";

        String [] catsArray = catTypes.split("cat");
        System.out.println("Number of 'cat' in the String = " + (catsArray.length -1));

        for( String each : catsArray) {
            System.out.println(each);
        }


      /**  int count = 0;
        for(int i = 0; i < catTypes.length(); i++) {
            if(catTypes.substring(i, i+3)) {
                count++;

            }
        }
       */

    }
}
