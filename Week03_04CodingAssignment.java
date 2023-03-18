package week03;

import java.lang.reflect.Array;

public class Week03_04CodingAssignment {

	public static void main(String[] args) {
		
		//1.
		int sumOfAges = 0;

		int[] ages = {3,9,23,64,2,8,28,93,42}; //added 42 to the original array for Step 1b
		
		ages[ages.length-1] -= ages[0];
		
		System.out.println(ages[ages.length-1]);
		
		for(int age : ages) {
			sumOfAges += age;
		}

		System.out.println(sumOfAges / ages.length);

		//2.
		int sumOfCharsInNames = 0;
		String linkNames = "";
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		for(String name : names) {
			sumOfCharsInNames += name.length();
			linkNames += name + " ";
		}
		
		System.out.println(sumOfCharsInNames / names.length);
		System.out.println(linkNames);

		//3.
		System.out.println("Use array.length - 1");
		
		//4.
		System.out.println("Use array[0]");
		
		//5. & 6.
		int[] nameLengths = new int[names.length];
		int sumOfNameLengths = 0;
	
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			sumOfNameLengths += nameLengths[i];
			System.out.println(nameLengths[i]);
		}

		System.out.println(sumOfNameLengths);
		
		//7.
		String word = "Hello";
		System.out.println(selfConcatString(word, 3));
		
		//8.
		String firstName = "Bruce";
		String lastName = "Wayne";
		System.out.println(createFullName(firstName, lastName));

		//9.
		int[] testArrInt = {50,50,75,75};
		System.out.println(isSumGreaterThan100(testArrInt));
		
		//10.
		double[] testArrDouble1 = {1.1,2.2,3.3,4.4,5.5};
		double[] testArrDouble2 = {6.6,7.7,8.8,9.9};
		System.out.println(returnsAverageOfElements(testArrDouble1));
		
		//11.
		System.out.println(compareArrayAverages(testArrDouble1,testArrDouble2));
		
		//12.
		boolean isHotOutside = false;
		double moneyInPocket = 10.51; 
		System.out.println(willBuyDrink(isHotOutside,moneyInPocket));
		
		//13.
		boolean isItemAvailable = true;
		boolean hasLibraryCard = true;
		System.out.println(allowItemCheckout(isItemAvailable, hasLibraryCard));
		
		
	}
	
	//7Method.
	static String selfConcatString(String word, int n) {
		String combine = "";
		for(int i = 0; i < n; i++) {
			combine += word;
		}
		return combine;
	}
	
	//8Method.
	static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9Method.
	static boolean isSumGreaterThan100(int[] arr) {
		int sumOfInts = 0;
		for(int each : arr) {
			sumOfInts += each;
		}
		if(sumOfInts > 100) {
			return true;
		}
		return false;
	}
	
	//10Method.
	static double returnsAverageOfElements(double[] arr) {
		double sumOfElements = 0;
		for(double each : arr) {
			sumOfElements += each;
		}
		return sumOfElements / arr.length;
	}
	
	//11Method.
	static boolean compareArrayAverages(double[] arr1, double[] arr2) {
		double sumArray1 = 0;
		double sumArray2 = 0;
		for(double each : arr1) {
			sumArray1 += each;
		}
		for(double each : arr2) {
			sumArray2 += each;
		}
		if((sumArray1/arr1.length) > (sumArray2/arr2.length)) {
			return true;
		}
		return false;
	}
	
	//12Method.
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	//13Method.
	//This method checks two conditions and returns a value of true or false
	//I created this method to solve the problem of whether or not someone can check an item out
	static boolean allowItemCheckout(boolean isItemAvailable, boolean hasLibraryCard) {
		if(isItemAvailable && hasLibraryCard) {
			return true;
		}
		return false;
	}
}
