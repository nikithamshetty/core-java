public class WashingMachine{

int door;
String color;
static int waterInletPipe;
static int waterOutletPipe ;
String brand;
int washingTubs;
int ledBulbs;
int buttons;
static int wheels;
int buzzer;

static{
  waterInletPipe=1;
  waterOutletPipe=1;
  wheels=4;
System.out.println("This is static block");
}

WashingMachine(int door, String color, String brand,  int washingTubs, int ledBulbs, int buttons, int buzzer)
{
this.door=door;
this.color=color;
this.brand=brand;
this.washingTubs=washingTubs;
this.ledBulbs=ledBulbs;
this.buttons=buttons;
this.buzzer=buzzer;
}

 public static void main(String[] args) {
System.out.println("This is main method");
WashingMachine SemiAutomatic=new WashingMachine(2,"Silver","warlpool",2,5,6,2);
WashingMachine TopLoad=new WashingMachine(1,"White","Samsung",1,10,11,1);
WashingMachine FrontLoad=new WashingMachine(1,"Black","LG",1,13,14,2);

System.out.println(SemiAutomatic.color);
System.out.println(TopLoad.waterInletPipe);
System.out.println(FrontLoad.brand);
System.out.println(TopLoad.wheels);
}
}


