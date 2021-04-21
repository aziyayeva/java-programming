package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int speeding = 45;
        boolean isSpeeding = speedLimit > speeding;
        System.out.println("isSpeeding = " + isSpeeding);
        System.out.println("isSpeeding = " + isSpeeding);
        System.out.println("isSpeeding = " + isSpeeding);
        
        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice)); //true
        System.out.println("");

        //? canAfford = ?
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford = " + canAfford);

        //using shorthand operator -> decrease balance by itemPrice (2 different ways)
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke? - " + isBroke);








    }
}
