package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {
	String myString = "d Hello dd dd ss world";
	char lastChar = myString.charAt(myString.length() - 1);
        for (int i = 0; i < myString.length() - 1; i++){
            if(myString.charAt(i) == lastChar){
                System.out.println("["  + i + "]" + myString.charAt(i) );
            }
        }
      }
    }

