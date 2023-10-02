public class Selection{
String Trees;
String Plants;
String Animals;
String colours;
String Things;
String Shapes;
String Flowers;
String Fruits;
String Soil;
String River;

Selection(String Trees, String Plants, String Animals, String colours , String Things,String Shapes ,String Flowers ,String Fruits , String Soil, String River)
{
this.Trees=Trees;
this.Plants=Plants;
this.Animals=Animals;
this.colours=colours;
this.Things=Things;
this.Shapes=Shapes;
this.Flowers=Flowers;
this.Fruits=Fruits;
this.Soil=Soil;
this.River=River;
}
public static void main(String[] args)
{
Selection select=new Selection("Banyan Tree","Tulsi","Lion","Grey","Table","Rectangle","Rose","Apple","Clay","Tunga");
System.out.println(select.Plants);
Selection select2=new Selection("Apple Tree","Rose Plant","Tiger","White","Bottle","Circle","Jasmine","Mango","Sand","Badra");
System.out.println(select2.Animals);
Selection select3=new Selection("Mango Tree","Hibiscus Plant","Panda","Black","Pen","Triangle","Sun Flower","Strawberry","Silt","Netravathi");
System.out.println(select3.Trees);
}
}

