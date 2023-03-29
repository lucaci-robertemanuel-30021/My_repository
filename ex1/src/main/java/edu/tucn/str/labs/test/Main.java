package edu.tucn.str.labs.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        Car c1 = new Car(1699,"Mazda",2000);
        Car c2= new Car(2399,"Volvo",8000);

        System.out.println("The most expensive car is "+c1.comparePrice(c1,c2) +" euros");
        System.out.println("The most powerful car has "+c1.compareEnginePower(c1,c2)+" engine power");

        ObjectMapper m= new ObjectMapper();
        File f = new File("car.json");
        File f2 = new File("car2.json");
        m.writeValue(f,c1);
        m.writeValue(f2,c2);

    }


}
