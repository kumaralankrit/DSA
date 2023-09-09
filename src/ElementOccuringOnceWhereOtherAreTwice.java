import java.util.HashMap;

public class ElementOccuringOnceWhereOtherAreTwice {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,5,3,4};
        System.out.println(singleElement(arr));
    }

    private static int singleElement(int[] arr) {
        //base check
        if (arr == null || arr.length == 0) {
            return 0;
        }

        //Using XOR
        //Time Complexity: O(n)

        int result = arr[0];
        for (int i = 1; i < arr.length; i++)
            result = result ^ arr[i];
        return result;


        //Using Sum formula(2*(sum_of_array_without_duplicates) – (sum_of_array))
        //Time Complexity: O(nlogn)

        /*HashMap<Integer, Integer> m = new HashMap<>();
        long sumWithoutDuplicates = 0, sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!m.containsKey(arr[i])) {
                sumWithoutDuplicates += arr[i];
                m.put(arr[i], 1);
            }
            sumOfArray += arr[i];
        }
        return (int) (2 * (sumWithoutDuplicates) - sumOfArray);*/
    }
}
