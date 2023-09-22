public class Tap
{
public static void main(String[] args)
{
int returnvalue1=divide(24,5);
System.out.println(returnvalue1);

int returnvalue2=divide(24,5,2);
System.out.println(returnvalue2);

charge('N');
charge(false);

open(19,12.7f);
open(12.3f,56);
}
static int divide(int valueone, int valuetwo)
{
System.out.println("invoking 2 parameters");
int dividedvalue=valueone/valuetwo;
return dividedvalue;
}
static int divide(int valueone, int valuetwo, int valuethree)
{
System.out.println("invoking 3 parameters");
int dividedvalue=valueone/valuetwo/valuethree;
return dividedvalue;
}
static void charge(char valueone)
{
System.out.println("method having char parameter");
System.out.println(valueone);
}
static void charge(boolean valueone)
{
System.out.println("method having boolean parameter");
System.out.println(valueone);
}
static void open(int valueone,float valuetwo)
{
System.out.println("changing the order of the parameter");
System.out.println(valueone+" "+valuetwo);
}
static void open(float valuetwo,int valueone)
{
System.out.println("changing the order of the parameter");
System.out.println(valuetwo+" "+valueone);
}
}