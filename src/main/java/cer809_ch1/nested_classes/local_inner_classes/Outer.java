package cer809_ch1.nested_classes.local_inner_classes;


public class Outer {
    private int length = 5;

    public void calculate() {
        final int width = 10;
        /**
         * NOT COMPILE
         *
         * variable needs to be  effective final
         */
        //width = 10;

        class Inner {

            public void multiply() {
                System.out.println(length * width);

            }

        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
