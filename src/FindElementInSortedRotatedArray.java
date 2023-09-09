public class FindElementInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3,};
        int search = 9;
        int searchIndex = sortedRotated(arr, search);
        System.out.println("Element index to be searched: " + searchIndex);
    }

    private static int sortedRotated(int[] arr, int search) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == search)
                return mid;
            if (arr[low] <= arr[mid]) {        //The left side is sorted
                if (arr[low] <= search && arr[mid] >= search) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {                           //Right half is sorted
                if (arr[mid] <= search && search <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
