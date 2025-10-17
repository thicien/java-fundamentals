//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0)
            System.out.println(num + " is positive.");
        else if (num < 0)
            System.out.println(num + " is negative.");
        else
            System.out.println("The number is zero.");
    }
}

