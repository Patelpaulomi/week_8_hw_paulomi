/**
 * Write a program in Java to display the pattern like a triangle with a number.   For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */


import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        n1();
    }

    public static void n1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int size = scanner.nextInt();
        System.out.println("Input number of row");

        for (int i = 1; i <= 10; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(m);
            }
            System.out.println(" ");
            scanner.close();
        }
    }

}