package javase01.t04;

public class FindMaxSum {

    public static double findMaxSum (double... vals) {
        if (vals.length % 2 != 0 || vals.length == 0) {
            System.out.println("Incorrect number of vals. Please input an even number of vals");
            return 0.0;
        }
        int posLeft = 0;
        int posRight = vals.length - 1;
        double maxSum = Double.MIN_VALUE;
        double sum;

        while (posRight - posLeft >= 1) {
            sum = vals[posLeft] + vals[posRight];
            if (sum > maxSum)
                maxSum = sum;
            posLeft++;
            posRight--;
        }
        return maxSum;
    }
}
