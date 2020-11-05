package Abdullo.ilmhona.problem2;

public class Car {
    String model;
    int year;

public Car (String modelInCons,int yearInCon){
    model = modelInCons;
    year = yearInCon;
    System.out.println(model + "\n" + year + "\n" );

}
public Car (){
    model = "BMW";
    year = 2020;
    System.out.println(model + "\n" + year + "\n" );
}
}
