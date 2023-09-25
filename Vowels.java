public class Vowels
{
Vowels()
{
System.out.println("Tell any one vowel");
}
Vowels(char letter)
{
 System.out.println("The vowel is "+letter);
}
public static void main(String[] args)
{
new Vowels();
new Vowels('I');
}
}