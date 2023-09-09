public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = checkAnagram(str1, str2);
        System.out.println(result);
    }

    private static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}
