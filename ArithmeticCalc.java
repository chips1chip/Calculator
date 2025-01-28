import java.util.Scanner; 
public class ArithmeticCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the first digit as input
        System.out.println("Enter the first digit:");
        Integer a = scanner.nextInt();

        // Taking the operator as input
        System.out.println("Enter an operator (+, -, *, /, %):");
        char operator = scanner.next().charAt(0);

        // Taking the second digit as input
        System.out.println("Enter the second digit:");
        Integer b = scanner.nextInt();

        // Switch case to perform the operation based on the operator
        switch (operator) {
            case '+' -> {
                // Performing addition
                System.out.println("a + b = " + (a + b));
            }
            case '-' -> {
                // Performing subtraction
                System.out.println("a - b = " + (a - b));
            }
            case '*' -> {
                // Performing multiplication
                System.out.println("a * b = " + (a * b));
            }
            case '/' -> {
                // Performing division
                System.out.println("a / b = " + (a / b));
            }
            case '%' -> {
                // Performing modulo operation
                System.out.println("a % b = " + (a % b));
            }
            default -> System.out.println("Invalid operator!");  // Handling invalid operator
        }

        scanner.close();  // Closing the scanner to release resources
    }
}
