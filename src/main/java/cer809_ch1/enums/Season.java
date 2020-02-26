package cer809_ch1.enums;

public enum Season {
    FALL("Medium") {
        /**
         * This one looks better. We only code the special cases and let the others use the
         * enum‐provided implementation. Notice how we still have the semicolon after FALL .
         * This is needed when we have anything other than just the values.
         * In this case, we have a default
         * method implementation.
         */
        public void printHours() {
            System.out.println("9 - 18");
        }
    }, SPRING("High") {
        public void printHours() {
            System.out.println("10 - 19");
        }
    };

    /**
     * The constructor is private because it can only
     * be called from within the enum .
     * The code will not compile with a public constructor.
     */
    private String expectedVisitors;

    private Season(String expectedVisitors) {
        System.out.println("constructor");
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

    public static void main(String[] args) {
        /**
         * Notice how we don’t appear to call the constructor.
         * We just say that we want the enum
         * value. The first time that we ask for any of the enum values,
         * Java constructs all of the enum values.
         * After that, Java just returns the already‐constructed enum values.
         * Given that explanation, you can see why this code calls the constructor only twice:
         */
        Season season1 = Season.FALL;
        Season season2 = Season.SPRING;
        Season season3 = Season.FALL;
        Season season4 = Season.SPRING;
        season4.printExpectedVisitors();
    }

    public abstract void printHours();

}

