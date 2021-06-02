package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        //1) static method can be called using classname
        StaticMethods.displayMessage("wooden spoon");
        //2) instance method needs an object to be called
       // StaticMethods.instanceMethod(); --> ERROR
        StaticMethods stm = new StaticMethods(); // need an OBJECT
        stm.instanceMethod();

        //2) Static method can only access other static variables and methods....


    }


}
