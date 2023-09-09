public class RotateString {
    public static void main(String[] args) {
        String s= "abcde";
        String goal="cdeab";
        System.out.println(checkIfStringIsSorted(s,goal));
    }

    private static boolean checkIfStringIsSorted(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
}