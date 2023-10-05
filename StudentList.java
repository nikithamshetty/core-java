public class StudentList{

public static void main(String[] args)
	{	
		// using literals
		String regno11="Nisha";
		String regno12="Mohammad";
		String regno13="Deepak";
		String regno14="Meghana";
		String regno15="Sadaf";
		String regno16="Sandya";
		String regno17="Nishan";
		String regno18="Sagar";
		String regno19="Anjana";
		String regno20="Madhu";

        //reassigning values to existing variables
		regno11="Manu";
		regno12="Swapna";
		regno13="Mithun";
		regno14="Darshan";
		regno15="Navya";

		//using new keyword		
                String regno21= new String("Nuthan");
		String regno22= new String("Mohan");
		String regno23= new String("Vidya");
		String regno24= new String("Vinaya");
		String regno25= new String("Sudeep");
		String regno26= new String("Vikram");
		String regno27= new String("Ram");
		String regno28= new String("Rukmini");
		String regno29= new String("Divya");
		String regno30= new String("Seetha");

                regno21="Soumya";
		regno22="Naveen";
		regno23="Namratha";
		regno24="Vishnu";
		regno25="Meena";

                System.out.println(regno11==regno11);
		System.out.println(regno12==regno17);
		System.out.println(regno13==regno13);
		System.out.println(regno14==regno19);
		System.out.println(regno15==regno15);
		
		System.out.println(regno21==regno21);
		System.out.println(regno22==regno27);
		System.out.println(regno23==regno23);
		System.out.println(regno24==regno29);
		System.out.println(regno25==regno25);
		
		System.out.println(regno11==regno21);
		System.out.println(regno12==regno12);
		System.out.println(regno13==regno23);
		System.out.println(regno14==regno14);
		System.out.println(regno15==regno25);
}
}