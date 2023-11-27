import java.util.Arrays;

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
        int left = arr1.length - 1;
        int right = 0;
        while (left > 0 && right < arr2.length) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
