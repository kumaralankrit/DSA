public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,1,1,1,0,0,1,0,1,1};
        System.out.println(maximumOnes(arr));
    }

    private static int maximumOnes(int[] arr) {
        int count = 0;
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maximum = Math.max(maximum, count);
            } else {
                count = 0;
            }
        }
        return maximum;
    }
}
