public class Glass{
	
	double length;
	double thickness;
	GlassType type;
	String usage;
	String brand;
	
	Glass(double length,double thickness,GlassType type,String usage,String brand){
		this.length = length;
		this.thickness = thickness;
		this.type = type;
		this.usage = usage;
		this.brand = brand;
		System.out.println("Running double,double,glasstype,string,string const of glass");
	}
	
	void usedInWindow(){
		System.out.println("Glass Used in window");
	}
}
