package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        //IF and ELSE statement example

        int hourlyRate = 44;
     //   String reply = "reject";
     //   String reply;
     //   if(hourlyRate > 45) {
     //       reply = "accept";
     //   } else {
    //        reply = "reject";
    //    }
    //    System.out.println("reply = " + reply);

        //Ternary example

        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        //new example

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim | Nadir" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        //new examples

        boolean isEligibleToDrive = false;
        String driving = isEligibleToDrive ? "yes, have DL, Can Drive" : "No Dl, cannot drive";
        System.out.println("driving = " + driving);




    }




    
    
}
