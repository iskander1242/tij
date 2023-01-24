package concurency_7_07.in_practice;

public class SynchronizedInteger {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        String st ="111 22 33\r\n" +
                "344 44 555";
        st = st.replaceAll("\\r\\n|\\r|\\n","_");
        for (int count=0; count < st.length(); count++) {
            System.out.print(st.charAt(count));
        }
    }
}
