package day23_string_manupilation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {

        String message = "sender: [Anna] From Number<(222) 333-4444> Message:{Hello, lets code some java}";

        //substring, indexOf
        int start = message.indexOf("["); /// once index finds the location it will give you the position...
        int end = message.indexOf("]");
        System.out.println(message.substring(start +1, end));
        
        String sender = message.substring(start + 1, end);
        System.out.println("sender = " + sender);
        
        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">") );
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{") +1, message.indexOf("}") );
        System.out.println("text = " + text);

        String word = " j a v a ";
        word.trim();
        System.out.println("word = " + word); // trim prints with no spaces......
        word = word.trim();
        System.out.println(word);







    }
}
