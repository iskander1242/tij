package concurency_14_08;

public class Fibonacci implements Runnable {
    private int countOfNumbers;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Thread(new Fibonacci(i)).run();
    }

    private int next(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return next(n - 1) + next(n - 2);
    }

    public Fibonacci(int countOfNumbers) {
        this.countOfNumbers = countOfNumbers;
    }

    @Override
    public void run() {
        System.out.println(next(countOfNumbers));
        Thread.yield();
    }
}
