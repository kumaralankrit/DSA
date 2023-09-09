public class ReverseNumber {
    public static void main(String[] args) {
        int n= 234;
        reverseOfNumber(n);
    }

    private static int reverseOfNumber(int n) {
        int reverse=0;
        while (n!=0){
            int remainder = n % 10;
            reverse= reverse*10+remainder;
            n=n/10;
        }
        System.out.println(reverse);
        return reverse;
    }
}
