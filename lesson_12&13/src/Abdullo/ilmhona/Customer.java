package Abdullo.ilmhona;

// Класс
public class Customer {
//Свойство класса
    private String lasName;
    private String name;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int iDNumber;

// Конструктор
    public Customer (String lasName, String name, String patronymic, String address, int cardNumber, int iDNumber){
        this.lasName = lasName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.iDNumber = iDNumber;

    }
// Сеттеры
    public void setLasName (String lasName){
        this.lasName = lasName;
    }
    public void setName (String name){
        this.name = name;
    }
    public void  setPatronymic (String patronymic){
        this.patronymic = patronymic;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
    public void setIDNumber(int iDNumber){
        this.iDNumber = iDNumber;
    }
 // Геттеры

    public String getLasName(String lasName) {
        return this.lasName;
    }

    public String getName(String name) {
        return this.name;
    }

    public String getAddress(String address) {
        return this.address;
    }

    public int getCardNumber(int cardNumber) {
        return this.cardNumber;
    }

    public int getIDNumber(int iDNumber) {
        return this.iDNumber;
    }

 // Вывод информации
    public void output(){
        System.out.println("Фамилия: " + lasName + "\n" + "Имя: " + name + "\n" + "Отчество: " +  patronymic + "\n" +
                "Адрес проживания: " + address + "\n" + "Номер карты: " + cardNumber + "\n" + "ИНН: "+ iDNumber + "\n");
    }
}
