public class Name1{
String a;
String b;
String c;
String d;

Name1(){
System.out.println("No name");
}

Name1(String a)
{
this();
System.out.println("1 name");
}

Name1(String a, String b)
{
this("Nisha");
System.out.println("2 name");
}

Name1(String a, String b, String c)
{
this(a,"Nuthan");
System.out.println("3 name");
}

Name1(String a, String b, String c, String d)
{
this(a,b,"Krishna");
System.out.println("4 name");
}

public static void main(String[] args)
{
new Name1("Nisha","Nuthan","Krishna","Ravi");
}
}

