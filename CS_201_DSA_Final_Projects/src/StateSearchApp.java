import java.util.*;

/**
 * StateSearchApp
 *
 * Console program that:
 * 1) Displays a text made from the 50 U.S. state names
 * 2) Searches a user-supplied pattern using Boyer–Moore (bad character rule)
 * 3) Exits on request
 *
 * Search is case-insensitive for user friendliness. Reported indices are 0-based
 * and refer to the displayed text.
 *
 * Algorithm notes:
 * - Preprocess pattern with a last-occurrence table (bad character heuristic)
 * - On mismatch at pattern index j against text character c,
 *   shift by max(1, j - last[c])
 *
 * Time complexity:
 * - Preprocessing: O(m) where m = pattern length
 * - Search: best case near O(n), worst case O(mn), where n = text length
 */
public class StateSearchApp {

    // 50 U.S. states as a single text, comma+space separated
    private static final String[] STATES = {
            "Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut",
            "Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa",
            "Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan",
            "Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire",
            "New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio",
            "Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota",
            "Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia",
            "Wisconsin","Wyoming"
    };

    private static final String TEXT = String.join(", ", STATES);

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                printMenu();
                String choice = sc.nextLine().trim();
                if (choice.isEmpty()) {
                    System.out.println("Please choose 1, 2, or 3.\n");
                    continue;
                }
                switch (choice.charAt(0)) {
                    case '1':
                        displayText();
                        break;
                    case '2':
                        handleSearch(sc);
                        break;
                    case '3':
                        System.out.println("Goodbye.");
                        return;
                    default:
                        System.out.println("Invalid selection. Please choose 1, 2, or 3.\n");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("========== State Search ==========");
        System.out.println("1) Display the text");
        System.out.println("2) Search");
        System.out.println("3) Exit program");
        System.out.print("Select an option: ");
    }

    private static void displayText() {
        System.out.println("\n--- Text (50 U.S. states) ---");
        System.out.println(TEXT + "\n");
    }

    private static void handleSearch(Scanner sc) {
        System.out.print("Enter a pattern to search for: ");
        String pattern = sc.nextLine();

        if (pattern == null || pattern.isEmpty()) {
            System.out.println("Pattern cannot be empty.\n");
            return;
        }

        // Case-insensitive search while preserving indices on the original TEXT
        List<Integer> indices = boyerMooreBadChar(TEXT, pattern, true);

        if (indices.isEmpty()) {
            System.out.println("No occurrences found.\n");
        } else {
            System.out.println("Match indices (0-based): " + indices + "\n");
        }
    }

    /**
     * Boyer–Moore using only the bad character rule.
     *
     * @param originalText the original text to search within
     * @param originalPattern the pattern to search for
     * @param caseInsensitive if true, compares on lowercase views
     * @return list of 0-based starting indices where pattern occurs in text
     *
     * Preprocessing: O(m)
     * Search: best case close to O(n), worst case O(mn)
     */
    public static List<Integer> boyerMooreBadChar(String originalText,
                                                  String originalPattern,
                                                  boolean caseInsensitive) {
        String text = caseInsensitive ? originalText.toLowerCase(Locale.ROOT) : originalText;
        String pat  = caseInsensitive ? originalPattern.toLowerCase(Locale.ROOT) : originalPattern;

        int n = text.length();
        int m = pat.length();
        List<Integer> matches = new ArrayList<>();
        if (m == 0 || m > n) return matches;

        // Build last occurrence table for all Unicode BMP chars (0..65535)
        // Using 65536 keeps code simple and avoids unexpected truncation.
        int[] last = new int[Character.MAX_VALUE + 1];
        Arrays.fill(last, -1);
        for (int i = 0; i < m; i++) {
            last[pat.charAt(i)] = i;
        }

        int s = 0; // current shift of the pattern over the text
        while (s <= n - m) {
            int j = m - 1;

            // move left while characters match
            while (j >= 0 && pat.charAt(j) == text.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                // full match found at shift s
                matches.add(s);

                // shift so next comparison is aligned after the current match
                if (s + m < n) {
                    char nextChar = text.charAt(s + m);
                    s += m - last[nextChar];
                } else {
                    s += 1;
                }
            } else {
                // bad character rule shift
                char bad = text.charAt(s + j);
                int lastPos = last[bad]; // -1 if not present in pattern
                s += Math.max(1, j - lastPos);
            }
        }

        return matches;
    }
}
