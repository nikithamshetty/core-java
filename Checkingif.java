public class Checkingif

{
static void car(long price)
{
if(price>=75000)
{
System.out.println("This Price is affordable");
}
else if(price<=150000)
{
System.out.println("This price is expensive" );
}
}
	
	
static void checkmark(int marks )
{
if(marks>=35)
{
System.out.println(" Result is pass" );
}
else if(marks<=35)
{
System.out.println("Result is fail" );
}
}

static void offer(int price)
{
if(price>=5000)
{
System.out.println("The customer is eligible for to get the coupon of 10%" );
}
else if(price>=10000)
{
System.out.println("The customer is eligible for to get the coupon of 20% " );
}
}

static void onlinepurchase(int furniture)
{
if(furniture>=5000)
{
System.out.println("These are the options for your price" );
}
else if(furniture<=10)
{
System.out.println("No result " );
}
}

static void checkmilk(float litre)
{
if(litre>=1.5f)
{
System.out.println("The milk packet is in right quantity" );
}
else if(litre<=1.5f)
{
System.out.println("This milk packet is leaked " );
}
}


public static void main(String[] args)
{
car(145000);
checkmark(68);
offer(6000);
onlinepurchase(3890);
checkmilk(1.3f);
}
}
	

		