public class Number{
int a;
int b;
int c;
int d;

Number(){
System.out.println("no parameter");
}

Number(int a)
{
this();
System.out.println("1 parameter");
}

Number(int a, int b)
{
this(2);
System.out.println("2 parameter");
}

Number(int a, int b, int c)
{
this(a,5);
System.out.println("3 parameter");
}

Number(int a, int b, int c, int d)
{
this(a,b,9);
System.out.println("4 parameter");
}

public static void main(String[] args)
{
new Number(2,4,6,9);
}
}

