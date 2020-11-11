package Abdullo.ilmhona;

public class Main {

	public static void main(String[] args) {
		String myString = "Hello world";

		if (myString.indexOf('x') >= 0 && myString.indexOf('x') < myString.indexOf('w')) {
			System.out.println("x" + " -встречается раньше");
		} else if (myString.indexOf('x') >= 0 && myString.indexOf('w') < 0) {
			System.out.println('x' + " -встречается раньше");
		}
		if (myString.indexOf('w') >= 0 && myString.indexOf('w') < myString.indexOf('x')) {
			System.out.println('w'+ " -встречается раньше");
		} else if (myString.indexOf('w') >= 0 && myString.indexOf('x') < 0) {
			System.out.println('w' + " -встречается раньше");
		}
		if (myString.indexOf('x') < 0) {
			System.out.println('x' + " -отсутствует в строке");
		} else if (myString.indexOf('w') < 0) {
			System.out.println('w' + " -отсутствует в строке");

		}
	}

}


