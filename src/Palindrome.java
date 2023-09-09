public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        checkPalindrome(n);
    }

    private static void checkPalindrome(int n) {
        int originalNumber= n;
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.println("originalNumber:"+originalNumber);
        if (originalNumber == reverse) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }
}
