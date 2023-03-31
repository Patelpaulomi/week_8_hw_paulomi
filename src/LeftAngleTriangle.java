// Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class LeftAngleTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int size = scanner.nextInt();
        LeftAngleTriangle leftAngleTriangle = new LeftAngleTriangle();
        leftAngleTriangle.leftTriangle(size);
        //close scanner
        scanner.close();
    }

    public void leftTriangle(int size) {

        //nested for loop
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


}
