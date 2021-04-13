package Week5;
/*
 * Write a method that prints the common elements between two arrays of strings.
 */



public class CommonElements {
	public static void main(String[] args) {

		String[] arr1 = { "Ahmet", "Memet", "Pikacu", "Mamut", "Bang","Emin" };
		String[] arr2 = { "Ahmet", "XYZ", "Emin", "Küpi", "Bicirik", "Bang","Emin"};
		printCommon(arr1, arr2);

	}

	public static void printCommon(String[] arr1, String[] arr2) {

		System.out.println("These elements are common in both arrays:");
        //It checks every element of first array
		for (int i = 0; i < arr1.length; i++) {
			//It checks every element of second array
			for (int j = 0; j < arr2.length; j++) {
				//If tey have common element, it prints first for loop's i value.
				if (arr1[i].equals(arr2[j])) {
				 System.out.println(arr1[i]);
				 //If an element common more than 1 time, to not print it more than 1, we break.
				 break;
				}
			}

		}
	}
}
