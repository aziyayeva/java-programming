package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {

        checkEligible(760);
        checkEligible(815);
        checkEligible(400);
        checkEligible(699);
     //   System.out.println(checkEligible(350);); ---. ERROR --- cannot print void method...
        System.out.println(getCreditScore());
        System.out.println("Credit Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score= " + score);

    }

    public static void checkEligible(int creditScore){

            if(creditScore >= 700){
                System.out.println("You are eligible for leasing this car");
            } else {
                System.out.println("Sorry, you are not eligible for leasing this car");
            }
    }

    public static int getCreditScore() {   /// this method returns an int
        return 800;


    }
}
