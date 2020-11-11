package Abdullo.ilmhona;

public class Main {
/*6) Даны два слова. Найдите только те символы слов, которые встречаются в обоих словах только один раз.*/

    public static void main(String[] args) {
	String firstWord = "Hello word";
	String newString = "";

	for (int i = 0; i < firstWord.length(); i++) {
		int counter = 0;
		for (int j = 0; j < firstWord.length(); j++) {
			if (firstWord.charAt(i) == firstWord.charAt(j) && j != i) {
				counter++;

			}

		}
		if (counter == 0) {
			newString = newString + firstWord.charAt(i);

		}
	}
		System.out.println(newString);
	}
    }

