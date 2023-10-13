public class ReadThings{
public static void main(String[] args)
{

RandomVariables var=new RandomVariables(WeekDays.MONDAY,Months.DEC,BirthYear1.TWO_THOUSAND_TWO,CarPrice.FORD,NameInitials.MANU);

if(var!=null)
{

var.getVariables();

ReadThings.getInfo(var);
ReadThings.getInfo1(var);
ReadThings.getInfo2(var);
ReadThings.getInfo3(var);
ReadThings.getInfo4(var);
}
}

static void getInfo(RandomVariables obj)
{
	if(obj.days.weekvalue=="Monday")
	{
		System.out.println("It is week days");
	}
	else
	{	
       System.out.println("It is week not days");
	}
}

static void getInfo1(RandomVariables obj1)
{
	if(obj1.month.numbers==7)
	{
		System.out.println("It is equal ");
	}
	else
	{	
       System.out.println("It is not equal");
	}
}

static void getInfo2(RandomVariables obj2)
{
	if(obj2.year.years==2002)
	{
		System.out.println("The Birth Year is correct ");
	}
	else
	{	
       System.out.println("The Birth Year is not correct");
	}
}
static void getInfo3(RandomVariables obj3)
{
	if(obj3.price.values > 4.56f)
	{
		System.out.println("The car price is in budget ");
	}
	else
	{	
       System.out.println("The car price is not in budget");
	}
}

static void getInfo4(RandomVariables obj4)
{
	if(obj4.initials.names =='M')
	{
		System.out.println("The initials is correct");
	}
	else
	{	
       System.out.println("The initialsare not correct");
	}
}

}