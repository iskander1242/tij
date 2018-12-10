package rank;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Example of StdIn and Matcher.
 *
 * @author Iskander
 */
public class StdInMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * First solution. Works unexpected!!!
         */
        while (scanner.hasNext()) {
            System.out.println(scanner.skip("[\\D]*").next());
        }

        /**
         * Second solution.
         */
        while (scanner.hasNext()) {
            String next = scanner.next();
            if (Pattern.compile("^[\\d]{2}$").matcher(next).find()) {
                System.out.println(next);
            }
        }
        scanner.close();
    }
}
