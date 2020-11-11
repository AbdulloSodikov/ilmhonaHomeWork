package Abdullo.ilmhona;

import java.util.stream.Stream;

public class Main {
    /*5) Замените в строке все вхождения 'word' на
    'letter'.*/
    public static void main(String[] args) {
        String myString = "this is word and this word is perfect ";
        String word = "word";
        String letter = "letter";
        String[] array = myString.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word))
                array[i] = letter;
        }
        String newString = String.join(" ", array);
        System.out.println(newString);


        }
    }

