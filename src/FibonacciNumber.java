import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number :");
        int size = scanner.nextInt();

        //object
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        fibonacciNumber.fibonacci(size);
    }

    //instance method no return with parameter
    public void fibonacci(int size) {
        int n1 = 0;
        int n2 = 1;
        //for loop
        for (int i = 1; i <= size; ++i) {
            System.out.println(n1);
            int result;
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
    }
}
