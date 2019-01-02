package rank.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * regex_1(?=regex_2)
 *
 * The positive lookahead (?=) asserts regex_1 to be immediately followed by regex_2.
 * The lookahead is excluded from the match. It does not return matches of regex_2.
 * The lookahead only asserts whether a match is possible or not.
 *
 * Ex:  c(?=o) -> chocolate
 */
public class PositiveLookahead {
    public static void main(String[] args) {
        checker("o(?=oo)", "gooooo!");

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

