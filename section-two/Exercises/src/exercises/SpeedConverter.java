package exercises;

public class SpeedConverter {
	public static void main(String[] args) {
		double kmph = 1.5;
		toMilesPerHour(kmph);
		printConversion(kmph);
	}
	 public static long toMilesPerHour(double kilometersPerHour) {
	      if (kilometersPerHour < 0) {
	           return -1;
	      } else {
	           long mph = Math.round(kilometersPerHour *.622);
	           return mph;
	      }
	 }
	 public static void printConversion(double kilometersPerHour) {
	     if (kilometersPerHour < 0) {
	         System.out.println("Invalid Value");
	     } else {
	         System.out.println(kilometersPerHour+" km/h = " +toMilesPerHour(kilometersPerHour)+" mi/h");
	     }
	 }
}