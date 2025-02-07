/**
* This program will display and calculate basic math operations.
*
* @author  Remy Skelton
* @version 1.0
* @since   2025-February-7
*/

final class MathOperators {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("15 + 7 = " + (15 + 7));
        // Subtraction
        System.out.println("12 - 8 = " + (12 - 8));
        // Multiplication
        System.out.println("5 * 3 = " + (5 * 3));
        // Division with integers
        System.out.println("18 / 6 = " + (18 / 6));
        // Division with float numbers
        System.out.println("10 / 3 = " + (10f / 3f));
        // Division with double numbers
        System.out.println("10 / 3 = " + (10d / 3d));
        // Exponents to the power of 2
        System.out.println("4^2 = " + (Math.pow(4, 2)));
        // Exponents to the power of 3
        System.out.println("6^3 = " + (Math.pow(6, 3)));
        // square root
        System.out.println("√25 = " + (Math.sqrt(25)));
    }
}
