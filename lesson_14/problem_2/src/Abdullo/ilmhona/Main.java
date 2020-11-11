package Abdullo.ilmhona;
/*2) Дана строка.Показать номера символов,совпадающих с последним символом строки.*/

public class Main {

    public static void main(String[] args) {
	String myString = "d Hello dd dd ss world";
	char lastChar = myString.charAt(myString.length() - 1);
        for (int i = 0; i < myString.length() - 1; i++){
            if(myString.charAt(i) == lastChar){
                System.out.println(i + 1 );
            }
        }
      }
    }

