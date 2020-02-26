package cer809_ch1.nested_classes.anonumous_inner;

public class AnonInner {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }

    interface SaleTodayOnlyInt{
         int dollarsOff();
    }

     int admission(int totalSale){
         /**
          * The code says to instantiate a new SaleTodayOnly object.
          * But wait. SaleTodayOnly is abstract . This is OK because we
          * provide the class body right there — anonymously.
          */
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 6;
            }

            /**
             * Pay special attention to the semicolon on line 8.
             * We are declaring a local variable on  these lines
             */
        };

       return totalSale - saleTodayOnly.dollarsOff();
    }

    int admissionWithInterface(int totalSale){
        /**
         * Line 7 is public instead of using default access
         * since interfaces require public methods. And that is it.
         * The anonymous inner class is the same whether
         * you implement an interface or extend a class!
         * Java figures out which one you want automatically.
         */
        SaleTodayOnlyInt saleTodayOnly = new SaleTodayOnlyInt() {
            @Override
            public int dollarsOff() {
                return 6;
            }

            /**
             * Pay special attention to the semicolon on line 8.
             * We are declaring a local variable on  these lines
             */
        };

        return totalSale - saleTodayOnly.dollarsOff();
    }
}
