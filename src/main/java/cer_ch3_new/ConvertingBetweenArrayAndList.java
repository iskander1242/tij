package cer_ch3_new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Iskander
 * on 7/4/18.
 */
public class  ConvertingBetweenArrayAndList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("hawk");
        arrayList.add("robin");

        System.out.println("\tarrayList.toArray()");
        Object[] objects = arrayList.toArray();
        System.out.println(Arrays.toString(objects));

        String[] strings = arrayList.toArray(new String[7]);
        System.out.println(Arrays.toString(strings) + " strings.length:" + strings.length);

        strings[2] = "goblin";
        System.out.println(Arrays.toString(strings) + " strings.length:" + strings.length);

        arrayList.add("owl");
        System.out.println(Arrays.toString(strings) + " strings.length:" + strings.length);

        /**
         * Converting from an array to a List is more interesting. The original array and created
         * array backed List are linked. When a change is made to one, it is available in the other. It
         * is a fixed-size list and is also known a "Backed List" because the array changes with it. Pay
         * careful attention to the values here:
         */
        /**
         * Line 5 converts an array to a List . It happens to be an implementation of List that
         * is not an ArrayList . Remember that a List is like a resizable array
         */
        System.out.println("\tBacked List");
        String[] array = {"hawk", "robin"};
        List list = Arrays.asList(array);
        System.out.println("list: " + list + " array: " + Arrays.toString(array));

        list.set(1, "test");
        array[0] = "new";
        //list.add("error"); //TODO  java.lang.UnsupportedOperationException

        System.out.println("list: " + list + " array: " + Arrays.toString(array));

        /**
         * This topic isn’t on the exam, but merging varargs with ArrayList conversion allows you
         * to create an ArrayList in a cool way:
         */
        List coolList = Arrays.asList("one", "two");

        List  arrayList1 =  Arrays.asList("1","2","3");
        //arrayList1.removeIf(e -> e.equals("2")); //UnsupportedOperationException:
        if (true)
            if (true) ;else ;

        int i = 10;
        boolean b = true;
//        while (b){System.out.println(1);}
        final  Byte b1 = new Byte((byte) 1);
//        System.out.println(c);
        boolean c = false;
//        switch (new Byte((byte) 1)){
//            case b1:  //todo constant expression required !!!
//                System.out.println("ffff");
//        }
    }
}
