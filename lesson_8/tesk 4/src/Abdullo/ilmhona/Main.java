package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {
        int[] arrayInPosAndNegNumber = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 20};
        int[] arrayOnlyPosNumber = filterArray(arrayInPosAndNegNumber);

    }
    public  static int [] filterArray (int[] array) {
        int counterPosNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterPosNumber++;
            }
        }
        int[] arrayPosNumber = new int[counterPosNumber];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPosNumber[j] = array[i];
                j++;
            }
        }
        return arrayPosNumber;
    }
}
