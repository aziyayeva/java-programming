package day22_string_manipulation;

import java.sql.SQLOutput;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";

        System.out.println(result.substring(13));

        //find the index of   :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex + 1));

        System.out.println(result.substring(result.indexOf(":") + 1 ));

        String today = "i learned [java] today";

        int start = today.indexOf("[");
        int end = today.indexOf("]");

        System.out.println(today.substring(start+1, end));
        // OR IN ONE LINE

        System.out.println(today.substring(today.indexOf("[") +1, today.indexOf("]")));







    }


}
