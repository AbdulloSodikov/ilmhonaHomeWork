package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 2, 3, 4, 5, 60, 7, 8, 91};
        int maxNumberInArray = maxInArray(array);
        
    }
    public static int maxInArray(int[] array) {
        int counterMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (counterMax < array[i]) {
                counterMax = array[i];
            }
        }
        return counterMax;
    }
}
