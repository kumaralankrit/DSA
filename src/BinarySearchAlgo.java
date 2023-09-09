public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 9;
        int lo = 0;
        int high = arr.length - 1;

        while (lo <= high) {
            int mid = lo + (high - lo) / 2;       //using mid=lo+(high-lo)/2 is good to avoid Integer overflow rather than using mid=(lo+high)/2
            if (arr[mid] == search) {
                System.out.println("element is at " + mid + " index");
                break;
            } else if (arr[mid] < search) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (lo > high) {
            System.out.println("element not found");
        }
    }
}
