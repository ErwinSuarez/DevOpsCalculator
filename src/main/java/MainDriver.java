public class MainDriver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 24;
        int num2 = 3;
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2 );
        System.out.println("\nThe product is: " + calc.multiply(num1, num2));
        System.out.println("The quotient is: " + calc.divide(num1, num2));
        System.out.println("The sum is: " + calc.addition(num1, num2));
        System.out.println("The difference is: " + calc.subtraction(num1, num2));
    }
}
