package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {

        int expLast4SSN = 1234;
        int expPinCode = 4321;

        int last4SSN = 1234;
        int pinCode = 1111;

        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");

        } else {
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSN){
                System.out.println("Last 4 ssn number is incorrect ");
            }
            if(expPinCode != pinCode) {
                System.out.println("Pin code is incorrect");
            }
        }
    }
}
