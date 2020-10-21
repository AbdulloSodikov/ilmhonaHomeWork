package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {
 Apple object1 = new Apple();
    object1.variety = "Симеренко";
    object1.color = "Зеленное";
    object1.weight = 80;
    object1.countryOfOrigin = "Таджикистан";

 Apple object2 = new Apple();
    object2.variety = "залатой";
    object2.color  = "Желтое";
    object2.weight = 50;
    object2.countryOfOrigin = "Россия";

 Apple object3 = new Apple();
    object3.variety = "Палосатый";
    object3.color = "красное";
    object3.weight = 60;
    object3.countryOfOrigin = "Китай";

        }
}
class Apple {

    String  variety; // сорт
    String color;   // цвет
    double weight; // вес
    String countryOfOrigin; // страна происхождения

}