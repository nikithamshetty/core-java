public class ToughenedGlass extends Glass{
	
	double weight;
	String ownerName;
	
	ToughenedGlass(double weight,String ownerName){
		super(45,4,GlassType.TINTED_GLASS,"Door","Mourya");
		this.weight = weight;
		this.ownerName = ownerName;
		System.out.println("Running double and String const in toughened glass");
	}
	
}
	
