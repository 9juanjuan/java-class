
public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max = " + myMaxFloatValue); 

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value = " + myMinDoubleValue);
        System.out.println("double max = " + myMaxDoubleValue); 

        int myIntValue = 5 / 3;
        // Double is the preferred floating data point
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        double inPounds = 200d;
        double conversionKG = 0.45359237d;
        System.out.println(inPounds + " lbs is "+ (inPounds*conversionKG)+ " in KG");

        

    }
}