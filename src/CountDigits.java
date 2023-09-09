public class CountDigits {
    public static void main(String[] args) {
        int n= 12345;
        System.out.println("number of digits in " + n + " is " + countNoOfDigits(n));
    }

    private static int countNoOfDigits(int n) {
        int count = 0;
        while(n!=0){
            n= n/10;
            count++;
        }
        return count;
    }

}
