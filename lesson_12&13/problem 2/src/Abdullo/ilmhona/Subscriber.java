package Abdullo.ilmhona;

public class Subscriber {
    private int iD;
    private String lasName;
    private String name;
    private String patronymic;
    private String address;
    private double timeInternationalCalls;
    private double timeCityCalls;

    public Subscriber(int iD, String lasName, String name, String patronymic, String address, double  timeInternationalCalls, double  timeCityCalls){
        this.iD = iD;
        this.lasName = lasName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.timeInternationalCalls = timeInternationalCalls;
        this.timeCityCalls = timeCityCalls;
    }

    public void setID(int iD){
        this.iD = iD;
    }
    public void setLasName(String lasName){
        this.lasName = lasName;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setTimeInternationalCalls(double timeInternationalCalls){
        this.timeInternationalCalls = timeInternationalCalls;
    }
    public void setTimeCityCalls(double timeCityCalls){
        this.timeCityCalls = timeCityCalls;
    }

    public int getID(){
        return this.iD;
    }
    public String getLasName(){
        return this.lasName;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public double getTimeInternationalCalls(){
        return this.timeInternationalCalls;
    }
    public double getTimeCityCalls(){
        return this.timeCityCalls;
    }

    public void cityExceededLim(){
        System.out.println("ID:" + iD + " " + lasName + " " + name + " " + patronymic + " проживает по адресу "
                + address );
    }
    public void internationalCall(){
        System.out.println("ID:" + iD + " " +  lasName + " " + name + " "+ patronymic + " проживает по адресу "
                +  address + ". Время международного разговора " + "составляет: " + timeInternationalCalls + " минут" );
    }

}
