import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);


        int result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);

        scanner.close();
    }


    public static int performOperation(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        return result;
    }
}