public class VaccumCleaner{

int brushes;
String color;
static int pipe ;
static int wheels ;
String brand;
static int powerCord;
int buttons;
int cleaningBags;
int handle;
int ledbulbs;

static{
  pipe=1;
  wheels=4;
  powerCord=1;
System.out.println("This is static block");
}

VaccumCleaner(int brushes, String color, String brand,  int buttons, int cleaningBags, int handle, int ledbulbs)
{
this.brushes=brushes;
this.color=color;
this.brand=brand;
this.buttons=buttons;
this.cleaningBags=cleaningBags;
this.handle=handle;
this.ledbulbs=ledbulbs;
}

 public static void main(String[] args) {
System.out.println("This is main method");
VaccumCleaner taskiVaccum=new VaccumCleaner(5,"Silver","Eureka",2,2,2,2);
VaccumCleaner dryVaccum=new VaccumCleaner(6,"White","Karcher",4,1,1,3);
VaccumCleaner steamVaccum=new VaccumCleaner(4,"Black","Panasonic",3,3,2,4);

System.out.println(taskiVaccum.brushes);
System.out.println(dryVaccum.pipe);
System.out.println(steamVaccum.brand);
System.out.println(steamVaccum.wheels);
}
}


