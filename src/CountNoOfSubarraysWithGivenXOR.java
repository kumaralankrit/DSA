import java.util.HashMap;

public class CountNoOfSubarraysWithGivenXOR {
    public static void main(String[] args) {
        int a[] = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarrayXOR(a, k));
    }

    private static int subarrayXOR(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i];
            if (map.get(xor ^ k) != null)
                count += map.get(xor ^ k);
            if (xor == k) {
                count++;
            }
            if (map.get(xor) != null)
                map.put(xor, map.get(xor) + 1);
            else map.put(xor, 1);
        }
        return count;
    }
}
