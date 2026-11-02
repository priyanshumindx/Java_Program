import java.util.*;
import java.time.DateTimeException;
import java.time.LocalDate;


public class Palindrome {

    public static boolean isPalindrome(String date, String format) {
        if (date == null || format == null) {
            return false;
        }

        String[] parts = date.split("[/|\\-]", -1);

        if (parts.length != 3) {
            return false;
        }

        try {
            for (String part : parts) {
                if (part.isEmpty() || !part.matches("\\d+")) {
                    return false;
                }
            }

            int day, month, year;

            switch (format) {
                case "DD-MM-YY":
                    if (parts[0].length() > 2 ||
                        parts[1].length() > 2 ||
                        parts[2].length() != 2) {
                        return false;
                    }

                    day = Integer.parseInt(parts[0]);
                    month = Integer.parseInt(parts[1]);
                    year = 2000 + Integer.parseInt(parts[2]);
                    break;

                case "MM-DD-YY":
                    if (parts[0].length() > 2 ||
                        parts[1].length() > 2 ||
                        parts[2].length() != 2) {
                        return false;
                    }

                    month = Integer.parseInt(parts[0]);
                    day = Integer.parseInt(parts[1]);
                    year = 2000 + Integer.parseInt(parts[2]);
                    break;

                case "YYYY-MM-DD":
                    if (parts[0].length() != 4 ||
                        parts[1].length() > 2 ||
                        parts[2].length() > 2) {
                        return false;
                    }

                    year = Integer.parseInt(parts[0]);
                    month = Integer.parseInt(parts[1]);
                    day = Integer.parseInt(parts[2]);
                    break;

                default:
                    return false;
            }

            // Validate the calendar date
            LocalDate.of(year, month, day);

            // Compare digits from both ends, ignoring
            // separators and zeros.
            int left = 0;
            int right = date.length() - 1;

            while (left < right) {
                while (left < right &&
                       (!Character.isDigit(date.charAt(left)) ||
                        date.charAt(left) == '0')) {
                    left++;
                }

                while (left < right &&
                       (!Character.isDigit(date.charAt(right)) ||
                        date.charAt(right) == '0')) {
                    right--;
                }

                if (date.charAt(left) != date.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }

            return true;

        } catch (DateTimeException | NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("25/5/25", "DD-MM-YY"));
        System.out.println(isPalindrome("5-25-25", "MM-DD-YY"));
        System.out.println(isPalindrome("3333|03|03", "YYYY-MM-DD"));
        System.out.println(isPalindrome("31-11-13", "DD-MM-YY"));
    }
}
