public class TestCalculator {
    public static void main(String[] args) {

        System.out.println(Calculator.divide(10, 2));
        System.out.println(Calculator.divide(10, 0));

        System.out.println(Calculator.convertToNumber("123"));
        System.out.println(Calculator.convertToNumber("abc"));

        System.out.println(Calculator.calculate('+', 5, 3));
        System.out.println(Calculator.calculate('/', 10, 0));
        System.out.println(Calculator.calculate('&', 4, 2));
    }
}
