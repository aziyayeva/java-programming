package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent" , "abc123");


    }


    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is wrong");
        }

    }
    public static boolean login(String userName, String password) {
        return false;

        }

    }
