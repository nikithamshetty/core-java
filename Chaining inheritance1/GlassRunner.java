public class GlassRunner{
	
	public static void main(String... values){
		
		Glass glass = new Glass(25,2,GlassType.TINTED_GLASS,"Door","Su yein");
		System.out.println("Brand:"+glass.brand);
		System.out.println("Length:"+glass.length);
		System.out.println("Thickness:"+glass.thickness);
		System.out.println("Type:"+glass.type);
		System.out.println("Usage:"+glass.usage);
		
		System.out.println("----------------------------------------------------------------------------");
		
		LaminatedGlass laminate = new LaminatedGlass(2000,1);
		System.out.println("Brand:"+laminate.brand);
		System.out.println("Length:"+laminate.length);
		System.out.println("Thickness:"+laminate.thickness);
		System.out.println("Type:"+laminate.type);
		System.out.println("Usage:"+laminate.usage);
		System.out.println("Cost:"+laminate.cost);
		System.out.println("Warranty:"+laminate.warranty);
		
		System.out.println("----------------------------------------------------------------------------");
		
		ToughenedGlass toughened = new ToughenedGlass(5,"Shekar");
		System.out.println("Brand:"+toughened.brand);
		System.out.println("Length:"+toughened.length);
		System.out.println("Thickness:"+toughened.thickness);
		System.out.println("Type:"+toughened.type);
		System.out.println("Usage:"+toughened.usage);
		System.out.println("Weight:"+toughened.weight);
		System.out.println("Owner name:"+toughened.ownerName);
		
		System.out.println("----------------------------------------------------------------------------");
		
		TintedGlass tinted = new TintedGlass();
		System.out.println("Brand:"+tinted.brand);
		System.out.println("Length:"+tinted.length);
		System.out.println("Thickness:"+tinted.thickness);
		System.out.println("Type:"+tinted.type);
		System.out.println("Usage:"+tinted.usage);
		System.out.println("Weight"+tinted.weight);
		System.out.println("Owner name:"+tinted.ownerName);
		
        System.out.println("----------------------------------------------------------------------------");
		
		GorillaGlass gorilla = new GorillaGlass();
		System.out.println("Brand:"+gorilla.brand);
		System.out.println("Length:"+gorilla.length);
		System.out.println("Thickness:"+gorilla.thickness);
		System.out.println("Type:"+gorilla.type);
		System.out.println("Usage:"+gorilla.usage);
		System.out.println("Cost:"+gorilla.cost);
		System.out.println("Warranty:"+gorilla.warranty);
	}
}
