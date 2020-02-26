package cer809_ch1.nested_classes;

public class CaseOfPrivateInterface {
    private interface Secret {
        void shh();
    }

    private class SecretImpl implements Secret {
        /**
         * class that implements interface must define that method
         * as public
         *
         * The interface itself does not have to be public , though. Just like any inner class
         * , an inner interface can be private. This means that the interface can only be referred to within the
         * current outer class
         */
        @Override
        public void shh() {
        }
    }
}
