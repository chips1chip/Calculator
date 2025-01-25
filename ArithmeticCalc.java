import java.util.Scanner;

public class ArithmeticCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit:");
        Integer a = sc.nextInt();
        System.out.println("Enter an operator(+,-,*,/,%):");
        char opr = sc.next().charAt(0);
        System.out.println("Enter the second digit:");
        Integer b = sc.nextInt();
        switch (opr) {
        case '+' -> {
            System.out.println("a+b=" + a+b);
            }
        case '-' -> {
            System.out.println("a-b=" + (a-b));
            }   
        case '*' -> {
            System.out.println("a*b=" + a*b);   
            }  
        case '/'  ->
            System.out.println("a/b=" + a/b);
        case '%' -> {
            System.out.println("a*b=" + a%b);   
            } 
        default -> System.out.println("invalid operator!");
        }
}
}