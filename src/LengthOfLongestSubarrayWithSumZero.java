import java.util.HashMap;

public class LengthOfLongestSubarrayWithSumZero {
    public static void main(String[] args) {
        int a[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(LongestSubArraySum(a));
    }

    private static int LongestSubArraySum(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxLength= 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == 0) {
                maxLength = i + 1;
            } else {
                if (map.get(sum) != null) {
                    maxLength = Math.max(maxLength, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return maxLength;
    }
}