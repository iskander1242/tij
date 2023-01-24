package concurency_7_07.in_practice;

/**
 *
 */
public class NoVisibility {
    public static volatile int number;
    public volatile boolean ready;

    private static class ReaderThread extends Thread {
        private volatile boolean ready;

        public ReaderThread(boolean ready){
            this.ready = ready;
        }

        public void run() {
            int n = 0;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("number " + number);
            while (!ready && n++ < 20) {
                Thread.yield();
                System.out.println("final number " + number);
            }
        }

        public static void main(String[] args) {
            NoVisibility noVisibility = new NoVisibility();
            new ReaderThread(noVisibility.ready).run();
            number = 42;
            noVisibility.ready = true;

        }
    }
}
