public class SumAndAverageDoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int upperBound = 100;

        do {
            sum += i;
            i++;
        } while (i <= upperBound);

        double average = sum / (double) upperBound;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}

