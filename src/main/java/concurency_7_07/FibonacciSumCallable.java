package concurency_7_07;

import java.util.ArrayList;
import java.util.concurrent.*;

public class FibonacciSumCallable implements Callable<Integer> {
    private static final int numberOfFibonacci = 10;
    private int summ;
    private int index;


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ArrayList<Future<Integer>> futureList = new ArrayList<>();
        for (int i = 0; i < numberOfFibonacci; i++) {
            FibonacciSumCallable fibonacciCallable = new FibonacciSumCallable(i);
            futureList.add(executorService.submit(fibonacciCallable));
        }

        for (Future<Integer> i : futureList) {
            try {
                System.out.println("Sum= " + i.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }

    public FibonacciSumCallable(int index) {
        this.index = index;
    }

    private int next(int n) {
        return (n == 0) ? 0 :
                ((n == 1) ? 1 : next(n - 1) + next(n - 2));
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < index+1; i++)
            summ = summ + next(i);
        return summ;
    }
}
