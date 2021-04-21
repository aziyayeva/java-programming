package day19_class_vs_object_strings;

/**
 * add new class LoginTest
 * main method
 *
 * expUserName = "cybertek"
 * expPassword = "Abc123"
 *
 * userName = "CYBERTEK"
 * password = "Abc123"
 *
 * userName is not case sensitive
 * password is case sensitive
 *
 * WHEN expUserName equals userName AND expPassword equals password
 *     -> "Pass - user successfully logged in"
 *
 * OTHERWISE:
 *     WHEN expUserName NOT equals userName
 *         -> "Incorrect Username"
 *     OTHERWISE:
 *         -> "Incorrect password"
 * ﻿
 */

public class LoginTest {
    public static void main(String[] args) {

        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK123";
        String password = "abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");

        } else {             // if not true check the reason why ---- else if nested method.....
            if(!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - user name was wrong");
            } else {
                System.out.println("Fail - password is incorrect");
            }

        }
    }
}
