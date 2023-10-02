public class Bike{
String Model;
int engine;
String body;
String color;
String suspension;
String breaking;
String company;
int price;
String seats;
String exhaust;

Bike(String Model, int engine,String body,String color , String suspension,String breaking ,String company ,int price , String seat, String exhaust)
{
this.Model=Model;
this.engine=engine;
this.body=body;
this.color=color;
this.suspension=suspension;
this.breaking=breaking;
this.company=company;
this.price=price;
this.seats=seats;
this.exhaust=exhaust;
}
public static void main(String[] args)
{
Bike B1=new Bike("xblade",160,"fibre","grey","mono","single channel","Honda",140000,"dual","dual barrel");
System.out.println(B1.price);
Bike B2=new Bike("passion",110,"metal","black","dual","drum break","Hero",90000,"dual","single exhaust");
System.out.println(B2.Model);
Bike B3=new Bike("Hunter",350,"metal","dapper white","mono","dual channel","Royal enfield",250000,"dual","single exhaust");
System.out.println(B3.company);
}
}

