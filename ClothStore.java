public class ClothStore{
 
int tshirtPrice;
int jeansPrice;
int coatPrice;

ClothStore(int tshirtPrice, int jeansPrice, int coatPrice){
this(tshirtPrice, jeansPrice);
this.coatPrice=coatPrice;
}

ClothStore(int tshirtPrice, int jeansPrice){
this(tshirtPrice);
this.jeansPrice=jeansPrice;
}
ClothStore(int tshirtPrice){
this.tshirtPrice=tshirtPrice;
}

public static void main(String[] args)
{
ClothStore cloth=new ClothStore(150,650,300);
ClothStore cloth1=new ClothStore(250,950,500);
if(cloth!=null && cloth1!=null)
{
System.out.println(cloth.tshirtPrice);
System.out.println(cloth1.jeansPrice);
System.out.println(cloth.jeansPrice);
System.out.println(cloth1.tshirtPrice);
}
}
}