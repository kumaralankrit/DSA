public class LargestOddNumberInString {
    public static void main(String[] args) {
        String s = "3542";
        System.out.println(LargestOddNo(s));
    }

    public static String LargestOddNo(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c % 2 == 1) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}