import java.util.Scanner;

public class SumOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 != 0) {    // Check if the digit is odd
                sum += digit;
            }
            number /= 10;            // Remove the last digit
        }

        System.out.println("Sum of all odd digits: " + sum);
        scanner.close();
    }
}
