package cer809_ch3.generic;

import java.util.ArrayList;
import java.util.List;

public class UnboundWildcardEx {

    public static void printList(ArrayList<Object> list) {}

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

//        printList(stringList); //todo does not compile

        /**
         * printList() takes any type of list as a parameter. keywords is of type List<String> .
         * We have a match! List<String> is a list of anything. “Anything” just happens to be a
         * String here.
         */
        printList(stringList);

        List<Integer> integerList = new ArrayList<>();
        l5 : integerList.add(new Integer(100));
        /**
         * Wait. What’s wrong? A String is a subclass of an Object . This is true. However,
         * List<String> cannot be assigned to List<Object> . We know; it doesn’t sound logical. Java
         * is trying to protect us from ourselves with this one.
         */
//        List<Object> objectList = integerList; //todo does not compile
        /**
         * On line 4, the compiler promises us that only Integer objects will appear in numbers . If
         * line 6 were to have compiled, line 7 would break that promise by putting a String in there
         * since numbers and objects are references to the same object. Good thing that the compiler
         * prevents this.
         */
//        objectList.add("forty two");
//        System.out.println(objectList.get(1));
//
//        printList(stringList); //todo bound method

        Integer[] numbers = { new Integer(42)};
        Object[] objects = numbers;
        objects[0] = "forty two";
    }

    private static void printList(List<?> stringList) {
    }

}
