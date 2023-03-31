// Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        //instance object
        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle();
        rightAngleTriangle.rightangletriangle();

    }

    //instance method no return no parameter
    public void rightangletriangle() {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number :");
        int size = scanner.nextInt();

        //nested for loop
        for (int i = 1; i <= size; i++) {
            for (int p = i; p >= 1; p--) {
                System.out.print("@");
            }
            System.out.println(" ");
        }

        //closing scanner
        scanner.close();

    }

}