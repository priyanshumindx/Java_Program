
import java.util.*;

public class PhoneWordLookup {

    private static final String[] KEYPAD = {
        "", "", "ABC", "DEF", "GHI",
        "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };

    private static final int[] LETTER_TO_DIGIT = new int[26];

    static {
        for (int digit = 2; digit <= 9; digit++) {
            for (char ch : KEYPAD[digit].toCharArray()) {
                LETTER_TO_DIGIT[ch - 'A'] = digit;
            }
        }
    }

    private static String wordToNumber(String word) {
        StringBuilder number = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toUpperCase(word.charAt(i));

            if (ch < 'A' || ch > 'Z') {
                return null;
            }

            number.append(LETTER_TO_DIGIT[ch - 'A']);
        }

        return number.toString();
    }

    private static Map<String, List<String>> buildIndex(
            List<String> dictionary) {

        Map<String, List<String>> index = new HashMap<>();

        for (String word : dictionary) {
            if (word == null || word.isEmpty()) {
                continue;
            }

            String key = wordToNumber(word);

            if (key != null) {
                index.computeIfAbsent(
                    key, k -> new ArrayList<>()
                ).add(word.toLowerCase(Locale.ROOT));
            }
        }

        // Sort results and remove duplicate words.
        for (Map.Entry<String, List<String>> entry
                : index.entrySet()) {
            List<String> words = entry.getValue();
            Collections.sort(words);

            Set<String> unique = new LinkedHashSet<>(words);
            entry.setValue(new ArrayList<>(unique));
        }

        return index;
    }

    private static List<String> findWords(
            String number,
            Map<String, List<String>> index) {

        if (number == null || number.isEmpty()
                || number.length() > 10) {
            return Collections.emptyList();
        }

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (ch < '2' || ch > '9') {
                return Collections.emptyList();
            }
        }

        return index.getOrDefault(
            number, Collections.emptyList()
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine().trim();

        int count = Integer.parseInt(sc.nextLine().trim());

        List<String> dictionary = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            dictionary.add(sc.nextLine().trim());
        }

        Map<String, List<String>> index = buildIndex(dictionary);

        List<String> result = findWords(number, index);

        for (String word : result) {
            System.out.println(word);
        }

        sc.close();
    }
}
