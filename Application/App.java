public class App{
	
	Person[] personArray = new Person[10];
	
	boolean savePersonsDetails(Person person){
		
		for(int index=0;index<personArray.length;index++){
			
			if(personArray[index]==null){
				personArray[index] = person;
				System.out.println("Data Successfully saved");
				return true;
			}
			
			else{
				System.out.println("Index is not empty,so checking the next index");
			}	
		}
		System.out.println("No space to save");
		return false;
	}
}
			
	
