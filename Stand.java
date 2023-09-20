public class Stand{
public static void main (String[] args) {
letter();
location();
int returnvalue=add();
System.out.println(returnvalue);
short value=show();
System.out.println(value);
boolean statement=check();
System.out.println(statement);
char returnchar=words();
System.out.println(returnchar);
float returnfloat=decimal();
System.out.println(returnfloat);
long length=number();
System.out.println(length);
double dvalue=pointed();
System.out.println(dvalue);
byte bvalue=single();
System.out.println(bvalue);
}
static void letter(){
System.out.println("This is a letter for principal of college");
} 
static void location(){
System.out.println("Banglore");
}
static int add(){
int a=14;
int b=23;
int c=a+b;
return c;
}
static short show(){
short n1=12000;
return n1;
}
static boolean check(){
boolean w=false;
return w;
}
static char words(){
char a='A';
return a;
}
static float decimal(){
float i=10.5f;
return i;
}
static long number(){
long l=134789;
return l;
}
static double pointed(){
double d=12.67;
return d;
}
static byte single(){
byte b=4;
return b;
}
}
