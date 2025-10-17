public class SumAndAverageFor {
    public static void main(String[] args) {
        int sum = 0;
        int upperBound = 100;

        for (int i = 1; i <= upperBound; i++) {
            sum += i;
        }

        double average = sum / (double) upperBound;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
