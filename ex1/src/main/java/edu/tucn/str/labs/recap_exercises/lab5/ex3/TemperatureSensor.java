package edu.tucn.str.labs.recap_exercises.lab5.ex3;

import java.util.Random;

public class TemperatureSensor extends Sensor {
    private String location;

    public TemperatureSensor(String location) {
        this.location = location;
    }

    int readValue(){
        Random random=new Random();
        int r=random.nextInt(100);
        return r;
    }

    @Override
    public String getLocation() {
        return location;
    }
}

