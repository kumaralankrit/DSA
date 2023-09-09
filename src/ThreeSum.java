import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> answer;
        answer = sumOfThreeNo(arr);
        for (int i = 0; i < answer.size(); i++) {
            for (int j = 0; j < answer.get(i).size(); j++) {
                System.out.print(answer.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    //For multiple array of answer Triplet
    private static List<List<Integer>> sumOfThreeNo(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int lo = i + 1, hi = arr.length - 1, sum = 0 - arr[i];
                while (lo < hi) {
                    if (arr[lo] + arr[hi] == sum) {
                        result.add(Arrays.asList(arr[i], arr[lo], arr[hi]));
                        while (lo < hi && arr[lo] == arr[lo + 1])
                            lo++;
                        while (lo < hi && arr[hi] == arr[hi - 1])
                            hi--;
                        lo++;
                        hi--;
                    } else if (arr[lo] + arr[hi] < sum)
                        lo++;
                    else hi--;
                }
            }
        }
        return result;
    }

    /*private static void sumOfThreeNo(int[] arr) {
        Arrays.sort(arr);
        int m, r;
        int sum = 22;
        for (int i = 0; i < arr.length - 2; i++) {
            m = i + 1;
            r = arr.length - 1;
            while (m < r) {
                if (arr[i] + arr[m] + arr[r] == sum) {
                    System.out.println("Triplet is " + arr[i] + " " + arr[m] + " " + arr[r]);
                    return;
                } else if (arr[i] + arr[m] + arr[r] < sum) {
                    m++;
                } else
                    r--;
            }
        }
    }*/
}
