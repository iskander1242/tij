package concurency_7_07;

public class BasicThreads {
    public static void main(String[] args) {

        Thread thread2 =new Thread(new LiftOff());
        thread2.run();
        System.out.println("Waiting for LiftOff");
    }
}
