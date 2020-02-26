package cer809_ch1.enums;

public enum Seasons {
    /**
     * There are a few things to notice here. On line 2, we have a semicolon.
     * This is required if there is anything in the enum besides the values.
     *
     * This is such a subtle detail that we are going to say it again: remember that
     * the semicolon at the end of the enum values is optional only if the only
     * thing in the enum is that list of values.
     */
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        for (Seasons i : Seasons.values()) {
            System.out.println(i + " " + i.ordinal());
        }

//        if(Seasons.SPRING == 1){} //DOES NOT COMPILE

        Seasons seasons1 = Seasons.valueOf("FALL");
        /**
         * IllegalArgumentException, must be precise(proper) value
         */
        //Seasons seasons2 = Seasons.valueOf("fall");
        System.out.println("\tswitch:");
        Seasons fall = Seasons.FALL;

        switch (fall) {
            /**
             * DOES NOT COMPILE: switch case label
             * must be unqualified name of enumeration constant
             */
            //case Seasons.SUMMER:
            case SPRING:
                System.out.println("Spring is now");
                break;
            case FALL:
                System.out.println("Fall is now");
                break;

            default:
                System.out.println("default");
        }

        switch (fall) {
//            case 0: //todo DOES NOT COMPILE
//                System.out.println("Get out the sled!");
//                break;
        }
    }
}

//class ExtendSeasons extends  Seasons{} //todo NOT COMPILE: cannot inherit from enum

enum Days {MONDAY, TUESDAY
}