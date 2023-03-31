/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, number, temp, total = 0;
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Digit Number :");
        num = scanner.nextInt();

        //close the scanner
        scanner.close();

        //for loop
        number = num;
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        //if statement
        if (total == num) {
            System.out.println(num + "is an Armstrong number");
        } else {
            System.out.println(num + "is not an Armstrong number");
        }
    }
}
