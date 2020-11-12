package Abdullo.ilmhona;

public class Main {

	/*/ Дана строка. Определите, какой символ в ней
	встречается раньше: 'x' или 'w'. Если какого-то
	из символов нет, вывести сообщение об этом./*/

	public static void main(String[] args) {
		String myString = "Hello world";
		int x = myString.indexOf('x');
		int w = myString.indexOf('w');

		if(x == w){
			System.out.println("В строке 'х' и  'w' отсутствують");
		}
		else if (x == -1){
			System.out.println("В строке 'x' отсутствует, индекс 'w' в строке=[" + w + "]" );
		} else if (w == -1){
			System.out.println("В строке 'w' отсутствует, индекс 'x' в строке=[" + x + "]" );
		} else if (x<w){
			System.out.println("'x' в строке встречается первым");
		} else {
			System.out.println("'w' в строке встречается первым");
		}


	}

}


