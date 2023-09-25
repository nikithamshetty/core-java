public class Concept
{
Concept()
{
System.out.println("1 This is No parameter constructor");
}
Concept(int number)
{
 System.out.println(+number+" This is parameterized constructor");
}
public static void main(String[] args)
{
new Concept();
new Concept(2);
}
}