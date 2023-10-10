public class CeilingFan{

int wires;
String color;
static int wings ;
static String material ;
String model;
static int speed;
String brand;
String design;
String style;
int manufacturedYear;

static{
  wings=3;
  material="Metal";
  speed=5;
System.out.println("This is static block");
}
CeilingFan(int wires, String color, String model,  String brand, String design, String style, int manufacturedYear)
{
this.wires=wires;
this.color=color;
this.model=model;
this.brand=brand;
this.design=design;
this.style=style;
this.manufacturedYear=manufacturedYear;
}

 public static void main(String[] args) {
System.out.println("This is main method");
CeilingFan newModel=new CeilingFan(5,"Shiny Maroon","Aspire","Usha","Low Profile model","Blunt",2012);
CeilingFan lightVersion=new CeilingFan(7,"Matte Black","Mixuze","Havells","Lighty Version","Lightest",2015);
CeilingFan classyModel=new CeilingFan(4,"graphite Brown","Vitron","Crompton","Classy","Classic",2014);

System.out.println(newModel.wires);
System.out.println(lightVersion.speed);
System.out.println(classyModel.brand);
System.out.println(lightVersion.color);
}
}


