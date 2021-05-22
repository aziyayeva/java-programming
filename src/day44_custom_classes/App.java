package day44_custom_classes;

/**
 * App class is used
 * We are describing app properties and behaviour here. Objects will be able to use them
 */

            // class name should UpperCase
public class App {
    // adding data
    String name; //null by default
    double version; // 0.0 by default

    //behaviour method - when we add data and behaviour our methods are used to process inside(print, update).
    public void open() {
        System.out.println("Openning " + name + " app - version = " + version);

    }

}

