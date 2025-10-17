public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;
        double sumL2R = 0.0; // left-to-right
        double sumR2L = 0.0; // right-to-left

        // Sum from left to right
        for (int i = 1; i <= n; i++) {
            sumL2R += 1.0 / i;
        }

        // Sum from right to left
        for (int i = n; i >= 1; i--) {
            sumR2L += 1.0 / i;
        }

        // Display results
        System.out.println("Sum from left to right  = " + sumL2R);
        System.out.println("Sum from right to left  = " + sumR2L);
        System.out.println("Difference              = " + Math.abs(sumL2R - sumR2L));
    }
}