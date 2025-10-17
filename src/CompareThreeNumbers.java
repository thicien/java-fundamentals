import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("All numbers are equal");
        else if (a != b && a != c && b != c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");

        sc.close();
    }
}

