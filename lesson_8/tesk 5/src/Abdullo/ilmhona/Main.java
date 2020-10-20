package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {10, 2, 3, 4, 5, 6, 7, 8, 9}; // Задача № 6
        int totalNumberInArray = total(array1);
        

    }
    public static int total (int [] array){
        int counterTotal = 0;
        for ( int i = 0; i < array.length; i++){
            counterTotal += array[i];
        }
        return counterTotal;
    }
}
