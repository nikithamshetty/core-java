public class Name
{
Name()
{
System.out.println("What is your name?");
}
Name(String name)
{
 System.out.println("My name is "+name);
}
public static void main(String[] args)
{
new Name();
new Name("sachin");
}
}