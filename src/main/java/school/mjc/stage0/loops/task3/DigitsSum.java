package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = String.valueOf(t);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + t % 10;
            t = t / 10;
        }

        System.out.println(Math.abs(sum));
    }
}
