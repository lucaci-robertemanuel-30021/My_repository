package edu.tucn.str.labs.recap_exercises.lab5.ex3;

public class Controller {
    private TemperatureSensor tempSensor;
    private LightSensor lightSensor;

    public Controller(TemperatureSensor tempSensor, LightSensor lightSensor) {
        this.tempSensor = tempSensor;
        this.lightSensor = lightSensor;
    }

    void control(){

        System.out.println("Temperature sensor value:"+tempSensor.readValue());
        System.out.println("Light sensor value:"+ lightSensor.readValue());

    }
}
