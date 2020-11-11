package Abdullo.ilmhona;

public class Main {

  /*  4) Дана строка. Если ее длина больше 10, то оставить
    в строке только первые 6 символов, иначе дополнить
    строку символами 'o' до длины 12.*/

    public static void main(String[] args) {
	String myString = "Hello world";
	int lim = 10;
	int limMax = 12 - myString.length();

	if (myString.length() > lim){
	    String newString = myString.substring(0,7);
        System.out.println(newString);
    } else {

        for (int i = 0; i < limMax; i++ ){
            myString += 'o';

    }
        System.out.println(myString);


    }

    }
}
