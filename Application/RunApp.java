public class RunApp{
	
	public static void main(String [] args){
		
		App application = new App();
		
		String[] skill = {"Python","Java","HTML&CSS"};
		
		Person person1 = new Person("Netra",21,45.5f,55,skill);
		Person person2 = new Person("Surya",22,74.8f,75,skill);
		Person person3 = new Person("Mithun",21,67.8f,50,skill);
		Person person4 = new Person("Meghana",21,29.4f,65,skill);
		Person person5 = new Person("Shoba",22,78.9f,57,skill);
		Person person6 = new Person("Swapna",22,29.0f,67,skill);
		Person person7 = new Person("Muskan",23,40.7f,48,skill);
		Person person8 = new Person("Swabith",24,70.2f,55,skill);
		Person person9 = new Person("Nuthan",22,78.5f,64,skill);
		Person person10 = new Person("Sagar",25,29.6f,71,skill);
		
		application.savePersonsDetails(person1);
		application.savePersonsDetails(person2);
		application.savePersonsDetails(person3);
		application.savePersonsDetails(person4);
		application.savePersonsDetails(person5);
		application.savePersonsDetails(person6);
		application.savePersonsDetails(person7);
		application.savePersonsDetails(person8);
		application.savePersonsDetails(person9);
		application.savePersonsDetails(person10);
	}
}
		
		
		
		
