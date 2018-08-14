package concurency_14_08;

public class LiftOff implements Runnable {
    protected int countdown =10;
    private static int threadCount;
    private int id = threadCount++;


    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countdown = countDown;
    }

    @Override
    public void run() {
        while (countdown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }

    private String status() {
        return "#" + id + "(" + ((countdown > 0) ? countdown : "LiftOff") + ")";
    }

    public static void main(String[] args) {new LiftOff().run();
    }
}
