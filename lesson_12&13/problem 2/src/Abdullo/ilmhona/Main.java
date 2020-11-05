package Abdullo.ilmhona;

public class Main {

    public static void main(String[] args) {

	Subscriber[] subscribers = {
	  new Subscriber(123,"Сатторова", "Матлюба", "Абдухоликовна", "г.Душанбе, " +
              "ул.Н.Карабаева",0,500),
      new Subscriber(124,"Каримов","Усмонхуча","Парпиевич","г.Хучанд, ул.Дж.Народов",
              5,300),
      new Subscriber(125,"Ульфатова","Мавсима","Бобочоновна","г.Бохтар, ул.Х.Шерози",
              6.5,50)
    };

        System.out.print("Абонент(ы) которые превысили лимит: \n");
for (int i = 0; i < subscribers.length; i++){
     double lim = 400;
    if (subscribers[i].getTimeCityCalls() > lim){
        subscribers[i].cityExceededLim();
    }
  }
        System.out.print("\nАбонент(ы) которые воспользовались международными звонками: \n");
for (int i = 0; i < subscribers.length; i++){
    if (subscribers[i].getTimeInternationalCalls() > 0){
        subscribers[i].internationalCall();
    }
}
    }
}
