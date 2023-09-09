public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int a[] = {1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        System.out.println(maximumOnes(a));
    }

    private static int maximumOnes(int[] a) {
        int count = 0;
        int maximum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maximum = Math.max(maximum, count);
        }
        return maximum;
    }
}
