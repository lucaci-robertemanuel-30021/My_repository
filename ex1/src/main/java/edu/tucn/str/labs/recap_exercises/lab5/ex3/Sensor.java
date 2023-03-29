package edu.tucn.str.labs.recap_exercises.lab5.ex3;

public abstract class Sensor {
    private String location;

    abstract int readValue();
    public String getLocation() {
        return location;
    }
}
