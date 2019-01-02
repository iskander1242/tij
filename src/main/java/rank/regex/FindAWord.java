package rank.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Sample Input
 *
 * 1
 * foo bar (foo) bar foo-bar foo_bar foo'bar bar-foo bar, foo.
 * 1
 * foo
 * Sample Output
 *
 * 6
 */
public class FindAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.nextLine();
        String stringForSearch = scanner.nextLine();
        while (!scanner.hasNextInt()) {
            stringForSearch += "\t";
            stringForSearch += scanner.nextLine();
        }
        scanner.nextLine();

        while (scanner.hasNext()) {
            String expectation = scanner.next();
            Pattern p = Pattern.compile("\\b" + expectation + "\\b");
            Matcher m = p.matcher(stringForSearch);
            int Count = 0;
            while (m.find()) {
                Count += 1;
            }
            System.out.println(Count);
        }
    }
}


