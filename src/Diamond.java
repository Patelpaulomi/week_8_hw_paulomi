//Write a program in Java to display the pattern like a diamond.   While loop

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        diamond.diamond();
    }

    //no return no parametar
    public void diamond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int size = scanner.nextInt();

        //while loop
        int i = 1;
        int j;
        while (i <= size) {
            j = 1;
            while (j++ <= size - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");

            }
            System.out.println();
            i++;
        }
        i = size - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= size - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
        scanner.close();
    }
}

