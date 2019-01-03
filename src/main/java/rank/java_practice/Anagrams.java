package rank.java_practice;

import java.util.Scanner;

/**
 * Sample Input 1
 * <p>
 * anagramm
 * marganaa
 * <p>
 * Sample Output 1
 * <p>
 * Not Anagrams
 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    static boolean isAnagram(String a, String b) {
        String first = a.toUpperCase();
        String second = b.toUpperCase();
        return getMapOfChar(first).equals(getMapOfChar(second));
    }


    private static java.util.HashMap<Character, Integer> getMapOfChar(String first) {
        char firsts[] = first.toCharArray();
        java.util.Arrays.sort(firsts);
        //System.out.println("sort:" + Arrays.toString(firsts));
        char currentChar = firsts[0];
        java.util.HashMap<Character, Integer> mapOfChars = new java.util.HashMap<>();
        int k = 0;
        for (int i = 0; i < firsts.length; i++) {
            if (currentChar == firsts[i]) {
                k = k + 1;
            } else {
                mapOfChars.put(currentChar, k);
                currentChar = firsts[i];
                k = 1;
            }
            if (firsts.length - 1 == i) {
                mapOfChars.put(currentChar, k);
            }
            //System.out.println("currentChar" + currentChar);
        }
        //System.out.println("mapOfChars values:" + mapOfChars.values());
        //System.out.println("mapOfChars keys:" + Arrays.toString(mapOfChars.keySet().toArray()));
        return mapOfChars;
    }
}
