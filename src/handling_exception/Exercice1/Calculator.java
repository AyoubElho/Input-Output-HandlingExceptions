public class Calculator {

    // Method divide
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
        return a / b;
    }

    // Method convertToNumber
    public static int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    // Method calculate
    public static double calculate(char operation, double a, double b) {

        switch (operation) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return divide(a, b);

            default:
                System.out.println("Error: Operation '" + operation + "' not supported");
                return 0;
        }
    }
}
