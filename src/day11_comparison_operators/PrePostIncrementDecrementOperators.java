package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT EXAMPLE ++ (++ -> means increase by 1)
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT EXAMPLE -> add 1 afterwards
        int num3 = 8;
        int num4 = num3;
        num3++; //add 1
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        //PRE-INCREMENT
        int apples = 5;
        int basket = ++apples;

        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        //POST-INCREMENT --> ADD ONE
        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);


        //EXAMPLE FROM THE NOTES
        int a = 50;
        int b = 22;
        // 50 + 23
        int c = a++ + ++b;
        // adds one to a, at this step afterwards

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(c);








    }


}
