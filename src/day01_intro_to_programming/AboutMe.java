package day01_intro_to_programming;

public class AboutMe {
    public static void main(String[] args){

       // System.out.println("Hello, My name is Anna. I live in Baltimore, MD");

                System.out.println("Are you sure you want to delete this file?");
                char selection = 'n';
                boolean answer;
                if(selection == 'y') {
                    System.out.println("Your file will be deleted");
                    answer = true;
                } else {
                    System.out.println("File deletion cancelled");
                    answer = false;
                }

                System.out.println("Did file get deleted? - " + answer);
            }
        }




