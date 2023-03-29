package edu.tucn.str.labs.test;

public class Car {
    private int engine_power;
    private String name;
    private double price;

    public Car() {
    }

    public Car(int engine_power, String name, double price) {
        this.engine_power = engine_power;
        this.name = name;
        this.price = price;
    }
    public int getEngine_power() {
        return engine_power;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int compareEnginePower(Car c1, Car c2){
        if(c1.getEngine_power() > c2.getEngine_power())
            return c1.getEngine_power();
            else
            return c2.getEngine_power();
    }
    public double comparePrice(Car c1, Car c2){
        if(c1.getPrice() > c2.getPrice())
            return c1.getPrice();
        else
            return c2.getPrice();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine_power=" + engine_power +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
