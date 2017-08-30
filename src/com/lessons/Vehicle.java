package com.lessons;

public abstract class Vehicle {

    //Поля координат
    private int coordinateX;
    private int coordinateY;

    //Поле цены
    private int price;
    //Поле скорости
    private int speed;
    //Поле года выпуска
    private int year;

    public Vehicle(int coordinateX, int coordinateY, int price, int speed, int year) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public Vehicle () {}

    void Show () {
        System.out.println("\nКоординаты : " + this.coordinateX + " " + this.coordinateY +
        "\nЦена         : " + this.price +
        "\nСкорость     : " + this.speed +
        "\nГод          : " + this.year);
    }
}
