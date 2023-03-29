package edu.tucn.str.labs.recap_exercises.lab5.ex3;


public class Main {
    public static void main(String[] args) {
        TemperatureSensor tempSensor= new TemperatureSensor("kitchen");
        LightSensor lightSensor= new LightSensor("bedroom");
        Controller c=new Controller(tempSensor,lightSensor);
        for(int i=0;i<20;i++)
          {
              c.control();
              try{
                  Thread.sleep(1000);
              }catch(InterruptedException e){}

          }
    }
}
