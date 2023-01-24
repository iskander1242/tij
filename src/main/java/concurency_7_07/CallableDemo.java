package concurency_7_07;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableDemo {

    static final int NUMBER_OF_THREADS = 15;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> futureList = new ArrayList<>();
        for (int i=0;i< NUMBER_OF_THREADS; i++){
            futureList.add(executorService.submit(new TaskWithRecult(i)));
        }
        for (Future<String>  i : futureList) {
            try {
                System.out.println(i.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }

        }
    }

}

class TaskWithRecult implements Callable<String> {
    private final int id;

    public TaskWithRecult(int id) {
        this.id = id;

    }

    @Override
    public String call() throws Exception {
        return "return TaskWithResult id=" + id;
    }
}