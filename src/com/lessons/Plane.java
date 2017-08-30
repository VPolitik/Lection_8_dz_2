package com.lessons;

public class Plane extends Vehicle {

    private int height;
    private int numberOfPasengers;

    public Plane(int coordinateX, int coordinateY, int price, int speed, int year, int height, int numberOfPasengers) {
        super(coordinateX, coordinateY, price, speed, year);
        this.height = height;
        this.numberOfPasengers = numberOfPasengers;
    }

    public Plane(int height, int numberOfPasengers) {
        this.height = height;
        this.numberOfPasengers = numberOfPasengers;
    }

    public Plane () {}


    void ShowPlane (){
        System.out.print("Высота : " + height +
        "\nКол-во пассажиров : " + numberOfPasengers + "\n");
    }
}
