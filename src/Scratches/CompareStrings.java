package Scratches;

public class CompareStrings {
	public static void main(String[] args) {
		
		String low = "Low";
		String medium = "Medium";
		String high = "High";
		
		
		Integer aLow = 0;
		Integer bMedium = 1;
		Integer cHigh = 2;
		
		System.out.println(low.compareTo(medium));
		System.out.println(low.compareTo(high));
		System.out.println(medium.compareTo(high));
		
		System.out.println(aLow.compareTo(bMedium));
		System.out.println(bMedium.compareTo(cHigh));
		System.out.println(aLow.compareTo(cHigh));
		
		
		
		/*Enumerations can be compared by their ordinals


		Assuming you've defined them in order of severity, you can compare the ordinals of each value. The ordinal is its position in its enum declaration, where the initial constant is assigned an ordinal of zero.
		You get the ordinal by calling the ordinal() method of the value.
		
		*/
		
	}
}
