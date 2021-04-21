package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black cat, red car";

        for(int i = 0; i < list.length()-2; i++) { /// -2 means we need to stop 2 steps before.....
            System.out.println(list.substring(i, i+3));

            if (list.substring(i, i+3).equals("cat") || list.substring(i,i+3).equals("car")) {
                System.out.println("cat or car found");

            }
        }



        //using substring print 3 letter
     //   int i = 0;
      //  System.out.println(list.substring(i, + i+3));
     //   i++;
     //   System.out.println(list.substring(i, + i+3));
     //   i++;
      //  System.out.println(list.substring(i, + i+3));
     //   i++;
     //   System.out.println(list.substring(i, + i+3));
     //   i++;
     //   System.out.println(list.substring(i, + i+3));
     //   i++;
     //   System.out.println(list.substring(i, + i+3));
     //   i++;
     //   System.out.println(list.substring(i, + i+3));
     //   i++;
      //  System.out.println(list.substring(i, + i+3));
     //   i++;
    }
}
