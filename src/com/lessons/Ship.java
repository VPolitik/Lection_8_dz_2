package com.lessons;

public class Ship extends Vehicle {

    private int numberOfPassangers;
    //Поле порта приписки
    private  int port;

    public Ship(int coordinateX, int coordinateY, int price, int speed, int year, int numberOfPassangers, int port) {
        super(coordinateX, coordinateY, price, speed, year);
        this.numberOfPassangers = numberOfPassangers;
        this.port = port;
    }

    public Ship(int numberOfPassangers, int port) {
        this.numberOfPassangers = numberOfPassangers;
        this.port = port;
    }

    public Ship () {}

    void ShowShip () {
        System.out.print("Кол-во пассажиров : " + numberOfPassangers +
        "\nПорт приписки : " + port + "\n");
    }
}
