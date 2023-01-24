package concurency_7_07;

public class BasicThreadsEx {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread2 =new Thread(new LiftOff());
            thread2.run();
        }
        System.out.println("Waiting for LiftOff");
    }
}
