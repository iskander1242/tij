package cer_ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Iskander
 * on 7/4/18.
 */
public class ConvertingBetweenArrayAndList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("hawk");
        arrayList.add("robin");
        Object[] objects = arrayList.toArray();
        System.out.println(Arrays.toString(objects));
        String[] strings = arrayList.toArray(new String[7]);
        System.out.println(Arrays.toString(strings) + " strings.length:" + strings.length);

        /**
         * Converting from an array to a List is more interesting. The original array and created
         * array backed List are linked. When a change is made to one, it is available in the other. It
         * is a fixed-size list and is also known a backed List because the array changes with it. Pay
         * careful attention to the values here:
         */
        String[] array = {"hawk", "robin"};
        List list = Arrays.asList(array);
        System.out.println("list: " + list + " array: " + Arrays.toString(array));
        list.set(1, "test");
        array[0] = "new";
        System.out.println("list: " + list + " array: " + Arrays.toString(array));
//        list.add("error"); //TODO  java.lang.UnsupportedOperationException
        /**
         * This topic isn’t on the exam, but merging varargs with ArrayList conversion allows you
         * to create an ArrayList in a cool way:
         */
        List coolList = Arrays.asList("one", "two");
    }
}
