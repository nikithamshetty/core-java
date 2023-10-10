public class OxfordSchool{

int benchesCount;
int studentsCount;
static String location ;
static String schoolName ;
int teachersCount;
static int establishedYear;
int clasrooms;
String principle ;
int feeStructure;
int sponsoredscholarship;

static{
  location="Shivamogga";
  schoolName="Oxford School";
  establishedYear=1986;
System.out.println("This is static block");
}

OxfordSchool(int benchesCount, int studentsCount, int teachersCount,  int clasrooms, String principle, int feeStructure, int sponsoredscholarship)
{
this.benchesCount=benchesCount;
this.studentsCount=studentsCount;
this.teachersCount=teachersCount;
this.clasrooms=clasrooms;
this.principle=principle;
this.feeStructure=feeStructure;
this.sponsoredscholarship=sponsoredscholarship;
}

 public static void main(String[] args) {
System.out.println("This is main method");
OxfordSchool schoolInfo1=new OxfordSchool(1500,4567,35,20,"Swathi",19000,16);
OxfordSchool schoolInfo2=new OxfordSchool(1600,3676,33,25,"Paramesh",25000,25);
OxfordSchool schoolInfo3=new OxfordSchool(1700,2787,40,30,"Veena",14000,10);

System.out.println(schoolInfo1.benchesCount);
System.out.println(schoolInfo2.studentsCount);
System.out.println(schoolInfo3.schoolName);
System.out.println(schoolInfo2.principle);
}
}


