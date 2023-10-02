public class Buildinghouse{
String Area;
int Pillarcount;
String Paint;
int Cement;
String Style ;
int Windowscount;
int lightscount;
int Tankscount ;
String Housename;
int Gates;

Buildinghouse(String Area, int Pillarcount , String Paint, int Cement , String Style, int Windowscount ,int lightscount,int Tankscount , String Housename, int Gates)
{
this.Area=Area;
this.Pillarcount=Pillarcount;
this.Paint=Paint;
this.Cement=Cement;
this.Style=Style;
this.Windowscount=Windowscount;
this.lightscount=lightscount;
this.Tankscount=Tankscount;
this.Housename=Housename;
this.Gates=Gates;
}
public static void main(String[] args)
{
Buildinghouse house1=new Buildinghouse("Banasvadi",130,"Red",100,"Western",4,10,2,"Maruthi",1);
System.out.println(house1.Area);
Buildinghouse house2=new Buildinghouse("Nagasandra",155,"Purple",150,"Western",6,25,3,"Anirudh",2);
System.out.println(house2.Paint);
Buildinghouse house3=new Buildinghouse("Rajajinagar",200,"White",500,"Western",6,32,2,"Pearl",1);
System.out.println(house3.Housename);
}
}

