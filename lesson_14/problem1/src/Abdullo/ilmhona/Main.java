package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {
    String myString = "Hello world";


        if(myString.length() > 5){
            System.out.println(myString.substring(0,3) + " " + myString.substring(myString.length() - 3));
        }
        else {
             String firstChar = myString.substring(1,2);
             System.out.println(firstChar.repeat(myString.length()));
        }
    }
    }









