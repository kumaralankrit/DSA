public class SumOfFirstNNumbersRecursion {
    public static void main(String[] args) {
        int n= 5;
        System.out.println(sumOfNnumbers(n));
    }

    private static int sumOfNnumbers(int n) {
        if (n==0)
            return 0;
        return n + (sumOfNnumbers(n-1));
    }
}
