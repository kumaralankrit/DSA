import java.util.HashMap;

public class LongestSubstringWithoutAnyRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcddefghijkll";
        System.out.println(nonRepeating(str));
    }

    private static int nonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int length = 0;
        while (right < str.length()) {
            if (map.containsKey(str.charAt(right)))
                left = Math.max(map.get(str.charAt(right)) + 1, left);
            map.put(str.charAt(right), right);
            length = Math.max(length, right - left + 1);
            right++;
        }
        return length;
    }
}
