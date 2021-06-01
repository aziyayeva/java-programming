package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        // List<Integer> daysNum = new ArrayList<>(Arrays.asList(10, 5, 1, 25, 30));
        //  System.out.println(daysNum);

        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));

        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        //using lambda
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removal" + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(50);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n-> n < 90); // remove nums less than 90
        System.out.println("nums = " + nums);
        
    }
    public static List<String> getDays() {
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wed", "Thursday", "Friday", "Sat", "Sun"));
        // or you can do it the longer version
        // List<String> days = new ArrayList<>();
        //days.add("Monday"); days.add("Tuesday"); days.add("Wed"); days.add("Thursday"); ... days.add(all).....
        return days;

    }

    /**
     *getRandomList
     * param: int size
     * return List<Integer>
     *     generate random number(0-100) the count of size, and assign to List then return
     *     getRandomList(3) -> 43, 12, 54
     *     getRandomList(2) -> 1, 4
     */

    public static List<Integer> getRandomList(int size){
        Random random = new Random(); //new Random object
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            nums.add(random.nextInt(101)); //generate random number and add to list
        }
        return nums;
    }
}
