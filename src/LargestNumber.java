import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int a[] = {11, 45, 23, 67, 23, 75, 23};
        largestNumber(a);
    }

    //using max variable
    private static int largestNumber(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        return (max);
    }

    //using .sort method
    /*private static void largestNumber(int[] a) {
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }*/
}
