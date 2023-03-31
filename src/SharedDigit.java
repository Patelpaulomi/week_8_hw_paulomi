/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not  within the
 * range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;  otherwise,
 * the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers NOTE: The method
 * hasSharedDigit should be defined as public static
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharrdDigit(12, 23));
        System.out.println(hasSharrdDigit(9, 99));
        System.out.println(hasSharrdDigit(15, 55));
    }

    //Static method with return with parameter
    public static boolean hasSharrdDigit(int fNumber, int sNumber) {
        if (fNumber >= 10 && fNumber <= 99 && sNumber >= 10 && sNumber <= 99 || fNumber / 10 == sNumber / 10) {
            return true;
        }

        return false;

    }
}