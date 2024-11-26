import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all odd numbers between " + a + " and " + b + ": " + sum);
        scanner.close();
    }
}
