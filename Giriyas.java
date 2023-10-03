public class Giriyas{
 
int refrigeratorPrice;
int mobilePrice;
int tvPrice;

Giriyas(int refrigeratorPrice, int mobilePrice, int tvPrice){
this(refrigeratorPrice, mobilePrice);
this.tvPrice=tvPrice;
}

Giriyas(int refrigeratorPrice, int mobilePrice){
this(refrigeratorPrice);
this.mobilePrice=mobilePrice;
}

Giriyas(int refrigeratorPrice){
this.refrigeratorPrice=refrigeratorPrice;
}

public static void main(String[] args)
{
Giriyas giri=new Giriyas(50000,130000,150000);
Giriyas giri1=new Giriyas(75000,114000,129000);
if(giri!=null && giri1!=null)
{
System.out.println(giri.refrigeratorPrice);
System.out.println(giri1.mobilePrice);
System.out.println(giri.mobilePrice);
System.out.println(giri1.refrigeratorPrice);
}
}
}