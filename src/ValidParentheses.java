import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[{}()]";
        System.out.println(validparentheses(s));
    }

    private static boolean validparentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char curr : s.toCharArray()) {
            if (curr == '(' || curr == '{' || curr == '[')
                stack.push(curr);
            else {
                if (stack.isEmpty())
                    return false;
                char ch = stack.pop();
                if ((curr == ')' && ch == '(') || (curr == '}' && ch == '{') || (curr == ']' && ch == '[')) ;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
