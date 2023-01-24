package concurency_7_07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibonacciFixedThreadPool implements Runnable {
    private static final int numberOfFibonacci = 10;
    private int index;


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < numberOfFibonacci; i++) {
            executorService.execute(new FibonacciFixedThreadPool(i));
        }
        executorService.shutdown();
    }

    public FibonacciFixedThreadPool(int index) {
        this.index = index;
    }

    private int next(int n) {
        return (n == 0) ? 0 : ((n == 1) ? 1 : next(n - 1) + next(n - 2));
    }

    @Override
    public void run() {
        System.out.println(next(index));
        Thread.yield();
    }
}
