public class RemoveDuplicateNoFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 9, 9, 9};
        int k = removeDuplicate(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
