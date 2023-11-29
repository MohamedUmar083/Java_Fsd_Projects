import java.util.Scanner;

public class arithmeticCalculator {
    private double number1;
    private double number2;


    public arithmeticCalculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public double add() {
        return number1 + number2;
    }


    public double subtract() {
        return number1 - number2;
    }


    public double multiply() {
        return number1 * number2;
    }


    public double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        arithmeticCalculator calculator = new arithmeticCalculator(number1, number2);
        System.out.println("");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();
        System.out.print("Select operation: ");
        System.out.print("");

        int choice = scanner.nextInt();

        double result = 0;
        System.out.println("");

        switch (choice) {
            case 1:
                result = calculator.add();
                System.out.println("Addition of both number is " + result);
                break;
            case 2:
                result = calculator.subtract();
                System.out.println("Subtraction of both number is " + result);
                break;
            case 3:
                result = calculator.multiply();
                System.out.println("Multiplication of both number is " + result);
                break;
            case 4:
                result = calculator.divide();
                System.out.println("Division of both number is " + result);
                break;
            default:
                System.out.println("Invalid operation. Please select a valid operation.");

        }


    }
}

