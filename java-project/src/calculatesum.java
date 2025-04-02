// filepath: /java-project/java-project/src/linkedlist.java
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            int secondNumber = scanner.nextInt();

            int sum = add(firstNumber, secondNumber);
            System.out.println("The sum is " + sum);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }
}