package Abdullo.ilmhona.main;

import Abdullo.ilmhona.problem2.Car;

public class Main {

    public static void main(String[] args) {
        Car object1 = new Car("Mercedes",2021);
        System.out.println(object1.model);

        Car object2 = new Car();
        System.out.println(object2.model);
    }
}
