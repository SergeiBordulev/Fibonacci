import java.util.Scanner;

public class Fibonacci {
    private static int getFibonacciIndexNumber(int fibonacciIndexNumber) {
        int fibonacciPreviousNumber = 0;
        int fibonacciNextNumber = 1;

        for (int i = 1; i <= fibonacciIndexNumber; i++) {
            int fibonacciNumber = fibonacciNextNumber + fibonacciPreviousNumber;
            fibonacciNextNumber = fibonacciPreviousNumber;
            fibonacciPreviousNumber = fibonacciNumber;
        }

        return fibonacciPreviousNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int fibonacciIndexNumber = scanner.nextInt();

        System.out.println("Your index: " + getFibonacciIndexNumber(fibonacciIndexNumber));
    }
}
