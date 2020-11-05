package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {

        Customer[] customers = {
        new Customer("Sodikov","Abdullo","Kahorovich","Rudaki street",
                     555,1),
        new Customer("Rahmonberdiev","Anvar","Alisherovich","Ayni street",
                     666,2),
        new Customer("Nuraliev","Nurimuhammad","Nuralievich","S.Sherozi street",
                     777,4),
        };
        for (int i = 0; i < customers.length;i++){
             if ((customers[i].getIDNumber(i)%2 == 0)){
                customers[i].output();
         }
    }
}
}





