package Abdullo.ilmhona.main;


import Abdullo.ilmhona.counter.Counter;

public class Main {

    public static void main(String[] args) {
        Counter problem1 = new Counter(2);
        problem1.numberPlus();

        Counter problem2 =new Counter(5);
        problem2.numberMinus();

        Counter problem3 = new Counter();
        int ReturnNumber = problem3.currentNumber();
        System.out.println(ReturnNumber);

    }

}
