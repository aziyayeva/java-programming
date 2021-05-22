package day45_oop;

public class TrafficLight {

    String color;

    /**
     * showColor
     * This is Ready Only Method, displays value
     */
    public void showColor () {  //read only method, just displays
        System.out.println("Current color = " + color);
    }

    /**
     * changeColor
     * This method
     *
     */

    public void changeColor (String newColor) {  // this method updates the value of color variable
        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")) {
            System.out.println("newColor = " + newColor);
        } else {
            System.out.println("ERROR: Invalid color - " + newColor);
        }
        System.out.println("Changing color to = " + newColor);
        color = newColor;

    }

}
