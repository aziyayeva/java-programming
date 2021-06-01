package day42_arraylist;

import javax.lang.model.SourceVersion;
import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("Size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("Reversed: " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount: " + vCount);

        System.out.println("Max char: " + Collections.max(letters));
        System.out.println("Min char: " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replace: " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23, 1, 55, 234, 7, -9, 0, 1, 5, 5, 5, 5, 5);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println("Nums after reverse: " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int fiveCount = Collections.frequency(nums, 5);
        System.out.println("fiveCount = " + fiveCount);

        int oneCount = Collections.frequency(nums, 1);
        System.out.println("oneCount = " + oneCount);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("After switching 5 to 50: " + nums);

        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After reverse sort: " + nums);

        Collections.shuffle(nums);
        System.out.println("Shuffle: " + nums);

    }
}
