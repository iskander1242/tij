package cer809_ch1.override_annotation;

public class Bobcat {

    public void findDen() {
    }
}

class MotherBobcat extends Bobcat {
    @Override public void findDen() {
    }
/**
 * todo does not compile, because violates first condition of @override annotation use
 */
//    @Override public void findDen(boolean bool) {
////    }


}

