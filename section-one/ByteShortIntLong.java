// package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int myValue = 10000; 

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue +1));
        // Underflow
        System.out.println("Busted MIN value = " + (myMinIntValue -1));

        //  Other primitives
        //  Bytes are useful for saving memory, small data type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Miniumum Value" + myMinByteValue);
        System.out.println("Byte Maximum Value" + myMaxByteValue);

        //  Short primitives
        // Same overflow/ underflow issues
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Miniumum Value" + myMinShortValue);
        System.out.println("Short Maximum Value" + myMaxShortValue);

        // 64 bytes
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Miniumum Value" + myMinLongValue);
        System.out.println("Long Maximum Value" + myMaxLongValue);

    }
}