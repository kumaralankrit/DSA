public class LeadersInArray {
    //Leader is an element that is greater than all of the elements on its right side in the array.
    public static void main(String[] args) {
        int a[] = {10, 22, 12, 3, 0, 6};
        leaderElements(a);
    }

    private static void leaderElements(int[] a) {
        int max = a[a.length - 1];
        System.out.println(a[a.length - 1] + " ");
        for (int i = a.length - 2; i >= 0; i--)
            if (a[i] > max) {
                System.out.println(a[i] + " ");
                max = a[i];
            }
    }
}
