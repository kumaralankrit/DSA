public class SortArrayOf0s1sAnd2s_DNF_Algo {
    public static void main(String[] args) {
        int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortArray(a);
        for (int print : a) {
            System.out.print(print + " ");
        }
    }

    private static void sortArray(int[] a) {
        //Dutch National Flag Algorithm
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0;
        int temp;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
