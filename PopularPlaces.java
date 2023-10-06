public class PopularPlaces
{
	public static void main(String[] args)
	{
		
		String karnataka="Banglore";
		String maharastra="Mumbai";
		String tamilNadu="   Ooty   ";
		String kerala="Munnar";
		String andraPradesh="TIRUPATI";
		String goa="beaches";
		String telangana="Hyderabad";
		String gujarat="Kutch";
		String bihar="Bodh Gaya";
		String odisha="Puri";
	
	
	
		boolean checkedPlace=karnataka.equals(kerala);
		System.out.println(checkedPlace);
                
                int length=maharastra.length();
		System.out.println(length);

                String afterTrimming=tamilNadu.trim();
		System.out.println(afterTrimming);
		
		char checkedChar=kerala.charAt(4);
		System.out.println(checkedChar);

                String convertingStringToLower=andraPradesh.toLowerCase();
		System.out.println(convertingStringToLower);
		
		String convertingStringToUpper=goa.toUpperCase();
		System.out.println(convertingStringToUpper);
		
		String populationOfHyderabad=String.valueOf(9.283f);
		System.out.println(populationOfHyderabad);
		
		int asciiValue=gujarat.codePointAt(3);
		System.out.println(asciiValue);
		
		String afterJoinedString=maharastra.concat(convertingStringToLower);
		System.out.println(afterJoinedString);
		
		boolean afterCheckingValue=odisha.equalsIgnoreCase(goa);
		System.out.println(afterCheckingValue);

		String correctionOfString=gujarat.replace('u','a');
		System.out.println(correctionOfString);
                
                int indexValue=karnataka.indexOf('g');
		System.out.println(indexValue);

                String[] splitString=bihar.split(" ");
		for(int i=0;i<splitString.length;i++)
	        System.out.println(splitString[i]); 
		
		boolean startWord=bihar.startsWith("Bodh");
		System.out.println(startWord);
		
		boolean endWord=bihar.endsWith("Gaya");
		System.out.println(endWord);
		
		char[] arrayChar=goa.toCharArray();
		for(int i=0;i<arrayChar.length;i++)
		System.out.println(arrayChar[i]);
		
	}
}
		
		
		
		
	
	