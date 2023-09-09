public class CountOccurrencesInSortedArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 15, 15, 15, 20, 40};
        int search = 15;
        int firstIndex = binarySearch(arr, search, true);
        if (firstIndex == -1) {
            System.out.println("Count is 0");
        } else {
            int lastIndex = binarySearch(arr, search, false);
            System.out.println(lastIndex - firstIndex + 1);
        }
    }

    private static int binarySearch(int[] arr, int search, boolean searchFirst) {
        int lo = 0;
        int high = arr.length - 1;
        int result = -1;

        while (lo <= high) {
            int mid = lo + (high - lo) / 2;
            if (arr[mid] == search) {
                result = mid;
                if (searchFirst) {
                    high = mid - 1;
                } else
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
