public class AnalogWatch{

static int shell;
static String uses;
static int buttons;
String beltType;
String brand;
int warranty;
int watchModel;
String watchFaceColor;
String watchType;
String watchMaterial;

static{
  shell=2;
  uses="To watch time";
  buttons=2;
System.out.println("This is static block");
}

AnalogWatch(String beltType, String brand,int warranty,int watchModel,String watchFaceColor,String watchType,String watchMaterial)
{
this.beltType=beltType;
this.brand=brand;
this.warranty=warranty;
this.watchModel=watchModel;
this.watchFaceColor=watchFaceColor;
this.watchType=watchType;
this.watchMaterial=watchMaterial;
}

 public static void main(String[] args) {
System.out.println("This is main method");
AnalogWatch oldModel=new AnalogWatch("Leather","Titan",2,34,"Blue","Female","Leather with metal body");
AnalogWatch mostUsedModel=new AnalogWatch("Black Metal","Fast Track",3,766,"Black","Male","Black with Silver metal");
AnalogWatch latestModel=new AnalogWatch("Golden Metal","Sonata",2,245,"Light Blue","Female","Golden with Silver Metal");

System.out.println(oldModel.beltType);
System.out.println(mostUsedModel.watchModel);
System.out.println(oldModel.buttons);
System.out.println(latestModel.brand);
}
}


