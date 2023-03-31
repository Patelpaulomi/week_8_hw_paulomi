/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.  The method should return
 * the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */


import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {

        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n1 = scanner.nextInt();
        System.out.println(getEvenDigitSum(n1));

        //closing scanner
        scanner.close();
    }

    //static method with return with parameter
    public static int getEvenDigitSum(int n1) {
        int digit;
        int sum = 0;

        //if and while loop
        if (n1 >= 0) {
            while (n1 > 0) {
                digit = n1 % 10;
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                n1 /= 10;
            }
            if (n1 >= 0) {
                System.out.print("The sum of even number is :");
            }
            return sum;
        }
        System.out.println("Invalid Input");
        return -1;
    }

}
