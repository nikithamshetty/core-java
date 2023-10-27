public class Person{
	String name;
	int age;
	float height;
	int weight;
	String[] skill;
	
	Person (String name, int age, float height, int weight, String[] skill){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.skill = skill;
	}
	
	String getPersonName(){
		return this.name;
	}
	
	int getPersonAge(){
		return this.age;
	}
	
	void setHeight(float height){
		this.height = height;
	}
	
	void setWeight(int weight){
		this.weight = weight;
	}
	
}