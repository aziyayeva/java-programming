package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {

        //DECLARE RAW ARRAYLIST
        ArrayList list1 = new ArrayList(); // raw ArrayList
        List list2 = new ArrayList();  // raw ArrayList

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(50.5);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);


    }

}
