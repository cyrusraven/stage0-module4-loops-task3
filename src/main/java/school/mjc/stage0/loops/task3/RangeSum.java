package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int i = firstBoarder; secondBoarder >= i; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
