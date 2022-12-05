package utils;

public class MathUtils {

    public static double calcFibonacci(long count) {
        long startTime = System.nanoTime();
        double prevNum = 0;
        double currentNum = 1;
        double finalNum;
        for (double i = 2; i < count; i++) {
            finalNum = (prevNum + currentNum);
            prevNum = currentNum;
            currentNum = finalNum;
        }
        return (System.nanoTime() - startTime) / 1000000D;
    }
}
