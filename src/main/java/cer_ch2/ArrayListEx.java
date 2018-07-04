package cer_ch2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander Sokolov
 * on 6/28/18.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        /**
         * TODO:creating:
         */
        ArrayList arrayList1 = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        ArrayList<String> arrayList5 = new ArrayList<>();

        List<String> arrayList6 = new ArrayList<>();
        /**
         *In the meantime, just know that you can store
         * an ArrayList in a List reference variable but not vice
         versa
         */
        //ArrayList<String> arrayList7 = new List(); //todo:do not compile
        /**
         * add
         */
        System.out.println("    add:");
        ArrayList<String> arrayList7 = new ArrayList<>();

        arrayList7.add("sparrow");
        //arrayList7.add(Boolean.TRUE);//todo:COMPILE error
        ArrayList<String> arrayList8 = new ArrayList<>();
        arrayList8.add(0,"hawk");
        arrayList8.add(0,"hawk");
        arrayList8.add(0,"cardinal");
        arrayList8.add(1,"blue joy");
        System.out.println(arrayList8.toString());

        /**
         * remove
         */
        System.out.println("    remove:");
        System.out.println(arrayList8.toString());
        System.out.println(arrayList8.remove("hawk"));//remove only one match
        System.out.println(arrayList8.toString());
        System.out.println(arrayList8.remove("falcon"));
        System.out.println(arrayList8.toString());
        System.out.println(arrayList8.remove(0));
        System.out.println(arrayList8.toString());
        System.out.println(arrayList8.removeIf(c -> c.equalsIgnoreCase("hawk")));
        System.out.println(arrayList8.toString());

        /**
         * todo:set
         * The set() method changes one of the elements of the ArrayList without changing the size.
         */
        System.out.println("    set:");
        System.out.println(arrayList8.size());
        System.out.println(arrayList8.set(0,"falcon"));
        System.out.println(arrayList8.size());
        //System.out.println(arrayList8.set(1,"falcon"));// java.lang.IndexOutOfBoundsException:
        /**
         * todo:isEmpty  and  size:
         */
        System.out.println("isEmpty() and size:");
        ArrayList<String> birds = new ArrayList<>();
        System.out.println(birds.size());
        System.out.println(birds.isEmpty());
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.size());
        System.out.println(birds.isEmpty());

        /**
         * todo: clear()
         */
        System.out.println("    clear:");
        birds.clear();
        System.out.println(birds.size());
        System.out.println(birds.isEmpty());

        /**
         * todo:contains()
         */
        System.out.println("    contains:");
        System.out.println(birds.contains("falcon"));
        birds.add("hawk");
        birds.add("falcon");
        System.out.println(birds);
        System.out.println(birds.contains("falcon"));

    }
}
