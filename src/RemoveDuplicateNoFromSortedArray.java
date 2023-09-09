public class RemoveDuplicateNoFromSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 9, 9, 9};
        int k = removeDuplicate(a);
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int removeDuplicate(int[] a) {
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }
}
