package exercises;

public class DecimalComparator {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
	}
	public static boolean areEqualByThreeDecimalPlaces (double first, double second) {
		 double difference = first - second;
		 if (difference > .09999 || difference < -.09999) {
			 return false;
		 } else {
			 return true;
		 }
	}
}
