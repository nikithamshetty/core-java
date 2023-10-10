public class GodrejCupBoard{

int capacity;
String color;
String quality;
int racks;
int drawers;
static String handle;
static String brand;
static int mirror;
int hook;
int autolight;

static{
  brand="Godrej";
  mirror=1;
  handle="metal";
System.out.println("This is static block");
}

GodrejCupBoard(int capacity, String color, String quality,  int racks, int drawers, int hook, int autolight)
{
this.capacity=capacity;
this.color=color;
this.quality=quality;
this.racks=racks;
this.drawers=drawers;
this.hook=hook;
this.autolight=autolight;
}

 public static void main(String[] args) {
System.out.println("This is main method");
GodrejCupBoard GodrejBoard=new GodrejCupBoard(10,"Brown","Antibrokable",3,1,2,1);
GodrejCupBoard HandmadeBoard=new GodrejCupBoard(20,"White","Water Resistance",4,2,1,2);
GodrejCupBoard LocalBoard=new GodrejCupBoard(30,"Black","Full plywood",2,3,3,4);

System.out.println(GodrejBoard.capacity);
System.out.println(HandmadeBoard.brand);
System.out.println(LocalBoard.mirror);
System.out.println(GodrejBoard.color);
}
}


