public class KadaneAlgorithm_MaxSubarraySumArray {
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArraySum(a);
    }

    //Kadane's Algorithm
    private static void maxSubArraySum(int[] a) {
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < a.length; i++) {
            curSum += a[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
