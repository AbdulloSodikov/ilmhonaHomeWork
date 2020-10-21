package Abdullo.ilmhona;

import java.io.CharArrayReader;

public class Main {

    public static void main(String[] args) {
    Car object1 = new Car();
        object1.madel = "Mercedes";
        object1.productionYear = 2020;
        object1.color = "Белый";
        object1.bodyType = "Сидан";
        object1.fuel = "Бензин";

    Car object2 = new Car();
        object2.madel = "Rang Rover";
        object2.productionYear = 2019;
        object2.color = "черный";
        object2.bodyType = "Внедорожник";
        object2.fuel = "Дизель";

    Car object3 = new Car();
        object3.madel = "BMW";
        object3.productionYear = 2020;
        object3.color = "Металик";
        object3.bodyType = "Купе";
        object3.fuel = "Бензин";

    Car object4 = new Car();
        object4.madel = "Tesla";
        object4.productionYear = 2020;
        object4.color = "Синий";
        object4.bodyType = "Лифтбэк";
        object4.fuel = "Электрический";

    }
}
class Car{
    String madel;
    int productionYear;
    String color;
    String bodyType;
    String fuel;
}