public class SortArrayOf0s1sAnd2s_DNF_Algo {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortArray(arr);
        for (int print : arr) {
            System.out.print(print + " ");
        }
    }

    private static void sortArray(int[] arr) {
        //Dutch National Flag Algorithm
        int lo = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp;
        while (mid <= high) {
            if(arr[mid]==0){
                temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
