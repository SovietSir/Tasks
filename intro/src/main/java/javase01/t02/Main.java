package javase01.t02;

public class Main {

    private static final double EPS = 0.0001;

    public static void main(String[] args) {
        int n = 1;
        while ((1.0/((n + 1)*(n + 1))) >= EPS)
            n++;
        System.out.printf("Number of minimal suitable member is: %d%n%n%n", n);
        for (int i = 1; i <= n; i++)
            System.out.printf("Member number: %03d  Member value: %f%n", i, 1.0 / ((i + 1) * (i + 1)));
    }
}