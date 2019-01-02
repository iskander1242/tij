package rank.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * regex_1(?=regex_2)
 * The negative lookahead (?!) asserts regex_1 not to be immediately followed by regex_2.
 * Lookahead is excluded from the match
 * (do not consume matches of regex_2), but only assert whether a match is possible or not.
 * Ex:  c(?=o) -> chocolate
 */
public class NegativeLookahead {
    public static void main(String[] args) {
        checker("(.)(?!\\1)", "gooooo");

    }

    public static void checker(String regex_Pattern, String checkingLine) {
        Pattern p = Pattern.compile(regex_Pattern);
        Matcher m = p.matcher(checkingLine);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d", Count);
    }
}

