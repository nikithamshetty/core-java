public class ApplicationForm{

Title title;
String name;
BirthMonth month;
BirthYear year;
MaritalStatus status;
ResidenceStates state;
ResidenceCountry country;
StayType stay;
long mobno;
CourseType course;
EducationType education;
Specialization degree;
Language lang;
Fluency flow;
EmploymentType employee;
Level level;
SkilledSubject subject;

ApplicationForm(Title title,String name,BirthMonth month,BirthYear year,MaritalStatus status,ResidenceStates state,ResidenceCountry country,StayType stay,long mobno,CourseType course,EducationType education,Specialization degree,Language lang,Fluency flow,EmploymentType employee,Level level,SkilledSubject subject){
this.title=title;
this.name=name;
this.month=month;
this.year=year;
this.status=status;
this.state=state;
this.country=country;
this.stay=stay;
this.mobno=mobno;
this.course=course;
this.education=education;
this.degree=degree;
this.lang=lang;
this.flow=flow;
this.employee=employee;
this.level=level;
this.subject=subject;
}

void showapplication(){
System.out.println(title);
System.out.println(name);
System.out.println(month);
System.out.println(year);
System.out.println(status);
System.out.println(state);
System.out.println(country);
System.out.println(stay);
System.out.println(mobno);
System.out.println(course);
System.out.println(education);
System.out.println(degree);
System.out.println(lang);
System.out.println(flow);
System.out.println(employee);
System.out.println(level);
System.out.println(subject);
}
}
