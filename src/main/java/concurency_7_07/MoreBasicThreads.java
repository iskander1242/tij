package concurency_7_07;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).run();
        System.out.println("More basic threads");
    }
}
