package yandex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class The_most_common_character_in_a_string {
    public static void main(String[] args) {
        String line = "1131gggggggg3131gggggg31313adggggadaggggdagggdad";
        System.out.println(getCommon(line));
    }

    private static String getCommon(String string) {
        Map<Byte, Integer> map = new HashMap();
        byte[] split = string.getBytes();

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            Integer i1 = map.get(split[i]);
            if (i1 == null) {
                map.put(split[i], 1);
            } else {
                map.put(split[i], ++i1);
            }
        }

        Optional<Map.Entry<Byte, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()
                );
        System.out.println("fsfsf");
        return new String(new byte[]{ maxEntry.get().getKey()});
    }
}
