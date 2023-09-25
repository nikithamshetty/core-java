public class Car
{
Car()
{
System.out.println("What is the cost of this car?");
}
Car(long cost)
{
 System.out.println("This car cost "+cost);
}
public static void main(String[] args)
{
new Car();
new Car(567000);
}
}