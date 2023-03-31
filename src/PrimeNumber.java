import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,  17....
 * are the prime numbers.)
 */


public class PrimeNumber {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ;");
        int number = scanner.nextInt();

        //instance object
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.prime(number);
        // closing scanner
        scanner.close();
    }

    //instance method no return with parameter
    public void prime(int n) {
        int count = 0;
        //for loop
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        //if statement
        if (count == 0 && n != 1) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + "is not Prine number");
        }
    }
}