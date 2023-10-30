public class Watch{
	String brand;
	String style;
	int price;
	boolean isWaterProof;
	String model;
	
	Watch(String brand,String style,int price,boolean isWaterProof,String model){
		this.brand = brand;
		this.style = style;
		this.price = price;
		this.isWaterProof = isWaterProof;
		this.model = model;
	}
	
	String getBrandName(){
		return this.brand;
	}
	
	String getStyleType(){
		return this.style;
	}
	
	int getPrice(){
		return this.price;
	}
	
	boolean getIsWaterProof(){
		return this.isWaterProof;
	}
	
	String getModel(){
		return this.model;
	}
	
	void printValues(){
		System.out.println("Watch brand name: "+brand);
		System.out.println("Watch style: "+style);
		System.out.println("Watch price: "+price);
        System.out.println("Is it waterproof: "+isWaterProof);
		System.out.println("Watch model: "+model);
	}
}
