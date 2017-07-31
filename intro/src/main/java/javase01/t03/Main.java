package javase01.t03;


import static java.lang.Math.*;

public class Main {

    private static final double MIN = 0.0;
    private static final double MAX = 10.0;
    private static final double STEP = 0.2;

    public static void main(String[] args) {
        double arg = MIN;
        while (arg <= MAX) {
            System.out.printf("Argument value: %f  Function value: %+f%n", arg, tan(2 * arg) - 3);
            arg += STEP;
        }
    }
}