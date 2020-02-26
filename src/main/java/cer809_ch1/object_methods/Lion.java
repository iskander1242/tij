package cer809_ch1.object_methods;

import java.util.Objects;

public class Lion {
    private String name;
    private Long id;

    public static void main(String[] args) {
        Lion lion = null;
        //System.out.println(lion.equals(new Lion()));
        System.out.println(new Lion().equals(null));
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Lion)) return false;
//        Lion other = (Lion)obj;
//        return id == other.id;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return Objects.equals(name, lion.name) &&
                Objects.equals(id, lion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
