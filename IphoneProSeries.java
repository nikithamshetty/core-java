public class IphoneProSeries{

int battery;
String color;
static String charger ;
static int camera ;
String model;
static int sim;
int displaySize;
int storage;
int price;
int processorChip;

static{
  charger="lightning Cable";
  camera=3;
  sim=2;
System.out.println("This is static block");
}

IphoneProSeries(int battery, String color, String model,  int displaySize, int storage, int price, int processorChip)
{
this.battery=battery;
this.color=color;
this.model=model;
this.displaySize=displaySize;
this.storage=storage;
this.price=price;
this.processorChip=processorChip;
}

 public static void main(String[] args) {
System.out.println("This is main method");
IphoneProSeries series1=new IphoneProSeries(3200,"Silver","14pro",7,128,129000,16);
IphoneProSeries series2=new IphoneProSeries(3095,"sierra Blue","13pro",6,256,119900,15);
IphoneProSeries series3=new IphoneProSeries(2815,"graphite","12pro",5,128,109900,14);

System.out.println(series1.battery);
System.out.println(series2.color);
System.out.println(series3.price);
System.out.println(series2.sim);
}
}


