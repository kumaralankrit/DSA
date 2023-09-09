public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 7, 8, 10};
        int arr2[] = {2, 3, 9};
        withoutExtraSpace(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static void withoutExtraSpace(int[] arr1, int[] arr2) {
        int i, k;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            int first = arr2[0];
            for (k = 1; k < arr2.length && arr2[k] < first; k++) {
                arr2[k - 1] = arr2[k];
            }
            arr2[k - 1] = first;
        }
    }
}
