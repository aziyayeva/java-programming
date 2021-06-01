package day43_list_custom_classes;


            //this is a SOURCE for the objects
            //this will become a template
public class Person {
            //the purpose of this template is to create Objects and reuse
        String firstName; // Data / Variables
        int age;          // Data / Variables
        char gender;

                // *** behaviour  *** //

    public void speak() {
        System.out.println("Person is speaking");
    }

    }

             //this is an one of the Objects
    class People {
        public static void main(String[] args) { //class for running with main method
            //create object of Person class - Instantiate Person class
            Person person1 = new Person();
            person1.firstName = "Bob";
            person1.age = 18;
            person1.gender = 'M';
            System.out.println("First name: " + person1.firstName + ", and the age is " + person1.age + " gender is " + person1.gender);
            person1.speak();

            Person person2 = new Person();
            person2.firstName = "Anna";
            person2.age = 33;
            person2.gender = 'F';
            System.out.println("First name: " + person2.firstName + ", and the age is " + person2.age + " gender is " + person2.gender);
            person2.speak();

        }
    }

