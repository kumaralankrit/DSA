public class LastOccurrenceInSortedArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 15, 15, 15, 20, 40};
        int search = 15;
        System.out.println(lastOccurance(arr, search));
    }

    private static int lastOccurance(int[] arr, int search) {
        int lo = 0;
        int high = arr.length - 1;
        int result = -1;

        while (lo <= high) {
            int mid = lo + (high - lo) / 2;
            if (arr[mid] == search) {
                result = mid;
                lo = mid + 1;
            } else if (arr[mid] < search) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}