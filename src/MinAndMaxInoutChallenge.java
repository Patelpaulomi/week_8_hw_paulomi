/**
 * -Read the numbers from the console entered by the user and print the minimum  and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInoutChallenge {
    public static void main(String[] args) {
        //instance object
        MinAndMaxInoutChallenge minAndMaxInoutChallenge = new MinAndMaxInoutChallenge();
        minAndMaxInoutChallenge.minMax();

    }

    //instance method no return no parameter
    public void minMax() {
        int count = 0;
        int min = 0;
        int max = 0;
        boolean first = true;
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        //while loop
        while (true) {
            System.out.println("Enter number :");
            boolean num = scanner.hasNextInt();
            count += 1;
            if (num) {
                int sNum = scanner.nextInt();
                if (first) {
                    first = false;
                    min = sNum;
                    max = sNum;
                }
                if (sNum > max) {
                    max = sNum;
                }
                if (sNum < min) {
                    min = sNum;
                }
                if (count == 5) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Tne minimum number is :" + min);
        System.out.println("The maximum number is :" + max);

        //scanner close
        scanner.close();
    }
}
