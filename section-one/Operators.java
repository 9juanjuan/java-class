// import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {
    
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+ 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " +result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4;
        System.err.println("20 / 5 = " + result);

        result = result % 3 ; // The remainder of (4 % 3) 
        System.out.println("4 % 3 = " + result);

        result++; // 1+1 = 2
        System.out.println("1 +1 = " + result);

        result--; 
        System.out.println("2 -1 = " + result);

        result += 2; // 1 + 2 = 3 
        System.out.println("1 + 2 = " + result );

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3;   // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -=2; // 10 -2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80; 
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        // Single & is a bitwise operate, same with single |
        int secondTopScore = 81; 
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than the second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("If either or both of conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        // ! logical complement operator 
        boolean isCar = true;
        if(!isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Ternary operator shortcut of if else statement
        boolean wasCar = isCar ? true: false;
        if (wasCar) {
            System.out.println("wasCar is true");
        } 
        
    }
}