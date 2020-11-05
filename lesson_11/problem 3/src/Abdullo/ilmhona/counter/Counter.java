package Abdullo.ilmhona.counter;

public class Counter {

    int currentNumber;


    public Counter(){
        currentNumber = 0;
    }
    public Counter (int x){
        currentNumber = x;
    }

    public void numberPlus(){
        currentNumber +=1;
        System.out.println(currentNumber);
    }
    public void numberMinus(){
        if (currentNumber - 1 >= 0){
            currentNumber -=1;
            System.out.println(currentNumber);
        }

    }
    public int currentNumber(){
        return  currentNumber;
    }
}