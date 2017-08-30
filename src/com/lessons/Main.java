package com.lessons;

public class Main {

    public static void main(String[] args) {


        Plane aist = new Plane(15 , 15 , 1000000, 700, 1999, 15, 5);


        Car reno = new Car(20 , 20 , 30000, 210, 2017);


        Ship shuna = new Ship(40 , 40 , 750000, 150, 1879, 10, 1078);

        System.out.println("Информация об общем классе самолётов");
        aist.Show();
        aist.ShowPlane();

        System.out.println("\nИнформация об общем классе автомобилей");
        reno.Show();

        System.out.println("\nИнофрмация об общем классе короблей");
        shuna.Show();
        shuna.ShowShip();
    }
}
