public class MoveZeroToEnd {
    public static void main(String[] args) {
        int a[] = {1, 2, 0, 4, 4, 0, 0, 0, 6, 8, 9};
        moveZeroToEnd(a);
    }

    private static void moveZeroToEnd(int[] a) {
        int k = 0;
        while (k < a.length) {
            if (a[k] == 0) {
                break;
            } else {
                k = k + 1;
            }
        }
        int i = k, j = k + 1;
        while (i < a.length && j < a.length) {
            if (a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
            j++;
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
