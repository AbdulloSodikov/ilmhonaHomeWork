package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {

    Box object1 = new Box();
        object1.height = 10.5;
        object1.length = 15.0;
        object1.weight = 25.2;
        object1.color = "Black";
        object1.material  = "plastic";
        System.out.println("Вес: " + object1.weight + " кг");
        System.out.println();

    Box object2 = new Box();
        object2.height = 5.2;
        object2.length = 10.0;
        object2.weight = 5.0;
        object2.color = "White";
        object2.material = "Wood";

        System.out.println("Размеры:" + object2.weight + "см на " + object2.length + "см");
        System.out.println("Материал объекта:" + object2.material);


    }
}
    class Box {
    double height;  // высота
    double length; // длина
    double weight; //вес
    String color;
    String material;

    }