/**
 * Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */


import java.util.Scanner;

public class Programme_3_VowelOfConsonant {
    public static void main(String[] args) {
        //instance object
        Programme_3_VowelOfConsonant programme3VowelOfConsonant = new Programme_3_VowelOfConsonant();
        programme3VowelOfConsonant.consonantVowel();

    }

    //instance method no return no parameter
    public void consonantVowel() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character :");
        char ch = scanner.next().charAt(0);

        //switch statement
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                i++;
        }
        //if condition
        if (i == 1) {
            System.out.println("Enter Character" + ch + "is vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch <= 1))
            System.out.println("Enter Character" + ch + "is consonant");
        else
            System.out.println("Not a alphbet");

        // closing scanner
        scanner.close();
    }
}
