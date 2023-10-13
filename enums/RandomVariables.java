public class RandomVariables{

WeekDays days;
Months month;
BirthYear1 year;
CarPrice price;
NameInitials initials;

RandomVariables(WeekDays days,Months month,BirthYear1 year,CarPrice price,NameInitials initials)
{
this.days=days;
this.month=month;
this.year=year;
this.price=price;
this.initials=initials;
}

void getVariables(){
System.out.println(days);
System.out.println(month);
System.out.println(year);
System.out.println(price);
System.out.println(initials);
}
}
