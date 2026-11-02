//
//import java.util.HashMap;
//import java.util.Map;
//
//public class DSA5 {
//    public static void main(String[] args) {
//
//        String str = "programming";
//
//        Map<Character, Integer> frequency = new HashMap<>();
//
//        // Step 1: Count every character
//        for (char ch : str.toCharArray()) {
//            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
//        }
//
//        // Step 2: Find first non-repeating character
//        boolean found = false;
//
//        for (char ch : str.toCharArray()) {
//            if (frequency.get(ch) == 1) {
//                System.out.println("First non-repeating: " + ch);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("No unique character");
//        }
//    }
//}
