public class AadhaarApplication{

static String name;
static int birthYear;
static String location ;
long phoneno;
String caste;
String schoolName;
String qualifications;
int puPercentage;
String gender;
String email;

static{
  name="Divya";
  birthYear=2002;
  location="Shivamogga";
System.out.println("This is static block");
}

AadhaarApplication(long phoneno, String caste, String schoolName,String qualifications, int puPercentage, String gender, String email)
{
this.phoneno=phoneno;
this.caste=caste;
this.schoolName=schoolName;
this.qualifications=qualifications;
this.puPercentage=puPercentage;
this.gender=gender;
this.email=email;
}

 public static void main(String[] args) {
System.out.println("This is main method");
AadhaarApplication AadharOld=new AadhaarApplication(7897563776l,"Balija","Royal Diamond","PU",89,"Female","div123@gmail.com");
AadhaarApplication Aadharmistaked=new AadhaarApplication(8976346280l,"Naidu","Sacred Heart","Degree",78,"Female","divya24@gmail.com");
AadhaarApplication AadharUpdated=new AadhaarApplication(9025356368l,"Balija","Sacred Heart","Degree",89,"Female","divya24@gmail.com");

System.out.println(AadharOld.phoneno);
System.out.println(Aadharmistaked.gender);
System.out.println(AadharUpdated.caste);
System.out.println(Aadharmistaked.name);
}
}


