public class SecondLargestInArrayWithoutSorting {
    public static void main(String[] args) {
        int a[] = {11, 45, 23, 67, 23, 75, 23};
        SecondLargestNumber(a);
    }

    private static void SecondLargestNumber(int[] a) {
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > Largest) {
                SecondLargest = Largest;
                Largest = a[i];
            } else if (a[i] > SecondLargest && a[i] != Largest) {
                SecondLargest = a[i];
            }
        }
        System.out.println(SecondLargest);
    }

}

