public class Store{
String location;
int pincode;
long mobno;
int discounts;
String nearlocation;
int timings;
String street;
int staffcount;
String storename;
String managername;

Store(String location, int pincode, long mobno, int discounts, String nearlocation, int timings, String street, int staffcount, String storename, String managername)
{
this.location=location;
this.pincode=pincode;
this.mobno=mobno;
this.discounts=discounts;
this.nearlocation=nearlocation;
this.timings=timings;
this.street=street;
this.staffcount=staffcount;
this.storename=storename;
this.managername=managername;
}
public static void main(String[] args)
{
Store sto1=new Store("Mysore",570001,8058978657l,20,"Basavanagudi",10,"main road",4,"More","Sudeer");
System.out.println(sto1.storename);
Store sto2=new Store("Banglore",5700231,8058978534l,15,"Banasvadi",7,"red cross road",10,"Super Market","Harish");
System.out.println(sto2.street);
Store sto3=new Store("Shimoga",57201,8058978345l,10,"Police chowki",7,"main road",6,"More","Naveen");
System.out.println(sto3.location);
}
}

