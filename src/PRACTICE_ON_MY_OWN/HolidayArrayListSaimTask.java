package PRACTICE_ON_MY_OWN;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Holidays
 * Create a method that accept an ArrayList of Strings. The String elements will be
 * Holidays
 * Create a method that will accept a number and return an ArrayList of Strings. This
 * number will represent a month number. The String elements returned will be all
 * the holidays in the given month.
 * Note: If a invalid month number is given as a parameter (not between 1 and 12)
 * then return null
 * See the next page for month number and holiday data (This is just a sample based
 * on federal holidays. You can add other ones if you want)
 ============================================================================================
 * Holidays - Data
 * 1: New Years day, Martin Luther King, Jr. Day
 * 2: President’s Day
 * 5: Memorial Day
 * 6: Independence Day
 * 9: Labor Day
 * 10: Columbus Day
 * 11: Veterans Day, Thanksgiving Day
 * 12: Christmas Day
 * 3, 4, 7, 8: None
 */

public class HolidayArrayListSaimTask {
    public static void main(String[] args) {



    }

    public static String holiday(int num) {
        // num is 5

        // We should have ArrayList by the months 1,2,3,4,5,6,8,9,10,11,12

        String[] jan = {"New Years day, Martin Luther King, Jr. Day"};
        String[] feb = {"President’s Day"};
        String[] march = {null};
        String[] april = {null};
        String[] may = {"Memorial Day"};
        String[] june = {"Independence Day"};
        String[] jul = {null};
        String[] aug = {null};
        String[] sep = {"Labor Day"};
        String[] oct = {"Columbus Day"};
        String[] nov = {"Veterans Day, Thanksgiving Day"};
        String[] dec = {"Christmas Day"};

        ArrayList<String[]> holiday = new ArrayList<>();
        holiday = new ArrayList<>(Arrays.asList(jan, feb, march, april, may));



        return null;
    }


}
