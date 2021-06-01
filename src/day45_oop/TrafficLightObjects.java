package day45_oop;

import day44_custom_classes.Animal;

public class TrafficLightObjects {
    public static void main(String[] args) {

        //created traffic Object
        TrafficLight  trafficLight = new TrafficLight();
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color); DIRECT access to variable. Not recommended
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight  trafficLight2 = new TrafficLight();
        trafficLight2.color = "black";
        trafficLight2.showColor();




    }
}
