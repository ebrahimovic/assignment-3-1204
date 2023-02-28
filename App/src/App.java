import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            int fact = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is " + fact);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close(); 
        }
    }

    public static int calculateFactorial(int n) throws NegativeException {
        if (n < 0) {
            throw new NegativeException("Number cannot be negative.");
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}