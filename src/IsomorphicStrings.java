import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
            if (hm.containsKey(s.charAt(i))) {
                {
                    if (!hm.get(s.charAt(i)).equals(t.charAt(i))) {
                        return false;
                    } else {
                        if (hm.containsValue(t.charAt(i))) {
                            return false;
                        }
                        hm.put(s.charAt(i), t.charAt(i));
                    }
                }
            }
        }
        return true;
    }
}
