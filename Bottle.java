public class Bottle
{
Bottle()
{
System.out.println("How much litre this bottle contain");
}
Bottle(float litre)
{
 System.out.println("This bottle can contain "+litre+" litre");
}
public static void main(String[] args)
{
new Bottle();
new Bottle(1.5f);
}
}