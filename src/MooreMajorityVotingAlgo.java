public class MooreMajorityVotingAlgo {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 2, 2, 2};
        System.out.println(majorityElement(a));
    }

    private static int majorityElement(int[] a) {
        int ansIndex = 0;
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ansIndex = i;
                count = 1;
            }
        }
        int checkCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[ansIndex]) {
                checkCount++;
            }
            if (checkCount > (a.length / 2)) {
                return a[ansIndex];
            }
        }
        return -1;
    }
}