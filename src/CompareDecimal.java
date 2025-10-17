
import java.util.Scanner;

public class CompareDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating-point number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second floating-point number: ");
        double b = sc.nextDouble();

        a = Math.round(a * 1000);
        b = Math.round(b * 1000);

        if (a == b)
            System.out.println("Numbers are the same up to three decimal places.");
        else
            System.out.println("Numbers are different.");
    }
}
