package concurency_7_07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CashedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            executorService.execute(new LiftOff());
        executorService.shutdown();
        System.out.println("CASHED");
    }
}
