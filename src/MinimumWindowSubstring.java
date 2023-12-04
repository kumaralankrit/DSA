import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(window(s, t));
    }

    private static String window(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int minimumLength = Integer.MAX_VALUE;
        int minimumLeft = 0;
        int requiredCharacters = t.length();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (target.containsKey(rightChar)) {
                target.put(rightChar, target.get(rightChar) - 1);
                if (target.get(rightChar) >= 0) {
                    requiredCharacters--;
                }
            }
            while (requiredCharacters == 0) {
                if (right - left + 1 < minimumLength) {
                    minimumLength = right - left + 1;
                    minimumLeft = left;
                }
                char leftCharacter = s.charAt(left);
                if (target.containsKey(leftCharacter)) {
                    target.put(leftCharacter, target.get(leftCharacter) + 1);
                    if (target.get(leftCharacter) > 0) {
                        requiredCharacters++;
                    }
                }
                left++;
            }
            right++;
        }
        return minimumLength == Integer.MAX_VALUE ? "" : s.substring(minimumLeft, minimumLeft + minimumLength);
    }
}
