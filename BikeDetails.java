public class BikeDetails{

static int handle;
String color;
String body;
static int stand;
String brand;
int speed;
String suspensition;
static int mirror;
int engineCapacity;
int gears;

static{
  handle=1;
  stand=2;
  mirror=2;
System.out.println("This is static block");
}

BikeDetails(String color, String body,  String brand, int speed, String suspensitiion, int engineCapacity, int gears)
{
this.color=color;
this.body=body;
this.brand=brand;
this.speed=speed;
this.suspensition=suspensition;
this.engineCapacity=engineCapacity;
this.gears=gears;
}

 public static void main(String[] args) {
System.out.println("This is main method");
BikeDetails Honda=new BikeDetails("White","Fibre","XBlade",120,"Mono",160,5);
BikeDetails Hero=new  BikeDetails("Red","Metal","Passion",100,"Dual",120,4);
BikeDetails Bajaj=new BikeDetails("Black","Fibre","Pulsar",120,"Mono",120,5);

System.out.println(Honda.brand);
System.out.println(Hero.handle);
System.out.println(Bajaj.color);
System.out.println(Honda.gears);
}
}


