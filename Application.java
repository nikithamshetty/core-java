public class Application{
String Name;
int Birthyear;
String Address;
int Pincode;
String Fathername ;
String Mothername;
long Phoneno;
String email ;
String City;
String State;

Application(String Name, int Birthyear, String Address, int Pincode, String Fathername, String Mothername ,long Phoneno,String email , String City, String State)
{
this.Name=Name;
this.Birthyear=Birthyear;
this.Address=Address;
this.Pincode=Pincode;
this.Fathername=Fathername;
this.Mothername=Mothername;
this.Phoneno=Phoneno;
this.email=email;
this.City=City;
this.State=State;
}
public static void main(String[] args)
{
Application app1=new Application("Shravan",2002,"near Kengeri",560001,"Mohan","Seetha",9855763437l,"shravan@gmail.com","Banglore","Karnataka");
System.out.println(app1.Name);
Application app2=new Application("Meena",2001,"Hosmane",577204,"Kumar","Manasa",6354882538l,"meena@gmail.com","Shimoga","Karnataka");
System.out.println(app1.DateofBirth);
Application app3=new Application("Suresh",2002,"Nagarbavi",577021,"Sidharth","Anusha",5473784628l,"suresh@gmail.com","Bhadravathi","Karnataka");
System.out.println(app3.Address);
}
}

