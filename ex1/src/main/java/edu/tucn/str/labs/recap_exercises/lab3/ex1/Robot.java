package edu.tucn.str.labs.recap_exercises.lab3.ex1;

public class Robot {
    private int x; //position

    public Robot(int x) {
        this.x = x;
    }

    void change(int k){
        if(k>=1)
            x+=k;
    }
    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                '}';
    }
}
