public class IronBox{

static String manufacturer;
static int defaultTemperature;
static boolean autoShutdownEnabled;
String model;
int temperature;
boolean ispowerOn;
boolean issteamEnabled;
String color;
int warrantyPeriod;
String powerCordType;

static{
manufacturer = "Usha Manufacturer";
defaultTemperature = 150;
autoShutdownEnabled = true;
System.out.println("This is static block");
}
IronBox(String model, int temperature, boolean ispowerOn, boolean issteamEnabled , String color, int warrantyPeriod, String powerCordType)
{
this.model=model;
this.temperature=temperature;
this.ispowerOn=ispowerOn;
this.issteamEnabled=issteamEnabled;
this.color=color;
this.warrantyPeriod=warrantyPeriod;
this.powerCordType=powerCordType;
}

 public static void main(String[] args) {
System.out.println("This is main method");
IronBox newModel=new IronBox("HandHeld",50,true,true,"Brown",3,"Doctorspare Electric iron cord");
IronBox lightVersion=new IronBox("Steamed",25,false,true,"White",2,"Indrico cord");
IronBox classyModel=new IronBox("HandHeld",30,true,false,"Black",1,"Cloth cord");

System.out.println(newModel.model);
System.out.println(lightVersion.temperature);
System.out.println(classyModel.manufacturer);
System.out.println(lightVersion.color);
}
}


