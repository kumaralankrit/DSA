public class PeakElementInArray {
    public static void main(String[] args) {
        int arr[] = {0, 6, 8, 5, 7, 9};
        int lo = 0;
        int high = arr.length - 1;
        System.out.println(findPeakElement(arr, lo, high));
    }

    private static int findPeakElement(int[] arr, int lo, int high) {
        int mid = lo + (high - lo) / 2;
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeakElement(arr, lo, mid - 1);
        } else {
            return findPeakElement(arr, mid + 1, high);
        }
    }

    //recursive
    /*private static int findPeakElement(int[] arr) {
        return helper(arr, 0, arr.length - 1);
    }

    private static int helper(int[] arr, int low, int high) {
        if (low == high) {
            return low;
        }
        int mid1 = low + (high - low) / 2;
        int mid2 = mid1 + 1;
        if (arr[mid1] > arr[mid2]) {
            return helper(arr, low, mid1);
        } else {
            return helper(arr, mid2, high);
        }
    }*/

    //iterative
    /*private static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = mid1 + 1;
            if (arr[mid1] < arr[mid2]) {
                low = mid2;
            } else {
                high = mid1;
            }
        }
        return low;
    }*/

}
