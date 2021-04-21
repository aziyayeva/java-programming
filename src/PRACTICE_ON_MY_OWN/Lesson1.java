package PRACTICE_ON_MY_OWN;

public class Lesson1 {
    public static void main(String[] args) {
        //Есть число n = 1, увеличить n 5 раз на число 2
        int height = 1;

        /*n = n + 2; //n = 3
        n = n + 2; //n = 5
        n = n + 2; //n = 7
        n = n + 2; //n = 9
        n = n + 2; //n = 11
        */
        //через цикл
        for(int i = 0; i<5; i++){
            height = height + 2;
            System.out.println(i);
        }
        System.out.println("n = "+height);
    }
}
