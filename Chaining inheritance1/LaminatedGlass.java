public class LaminatedGlass extends Glass{
	
	double cost;
	int warranty;
	
	LaminatedGlass(double cost,int warranty){
		super(32,2,GlassType.GORILLA_GLASS,"Window","Sonix");
		this.cost = cost;
		this.warranty = warranty;
		System.out.println("Running double and int const of laminatedGlass");
	}
}