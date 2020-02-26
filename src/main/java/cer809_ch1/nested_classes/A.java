package cer809_ch1.nested_classes;

public class A {
    private int x = 50;

    private class B {
        private int x = 40;

        private class C {
            private int x = 30;

            private void printAllX() {
                System.out.println("this.x: " + this.x);
                System.out.println("B.this.x: " + B.this.x);
                System.out.println("A.this.x: " + A.this.x);
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        /**
         * todo DOES NOT COMPILE
         */
        //A.B b = new B();
        B b = a.new B();
        A.B.C c = b.new C();
        B.C c1 = c; //todo ????
        c1.printAllX();
    }
}
