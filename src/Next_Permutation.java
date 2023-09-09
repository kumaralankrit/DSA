public class Next_Permutation {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 4, 2};
        nextPermutation(a);
        for (int print : a) {
            System.out.print(print + " ");
        }
    }

    private static void nextPermutation(int[] a) {
        if (a == null || a.length == 0)
            return;
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1])
            i--;
        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i])
                j--;
            swap(a, i, j);
        }
        reverse(a, i + 1, a.length - 1);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j)
            swap(a, i++, j--);
    }

}
