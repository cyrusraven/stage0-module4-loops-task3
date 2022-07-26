package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1 + "\n" + n2);
        for (int i = 1; i < lastFibonacci-1; i++) {
            System.out.println(i);
        }
    }
}
