import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int a[] = {1, 0, -1, 0, -2, 2};
        int sum = 0;
        List<List<Integer>> print = sumOfFourNo(a, sum);
        for (int i = 0; i < print.size(); i++) {
            for (int j = 0; j < print.get(i).size(); j++) {
                System.out.print(print.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> sumOfFourNo(int[] a, int sum) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

        if (a == null || a.length == 0)
            return result;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int number_3 = sum - a[i];
            for (int j = i + 1; j < a.length; j++) {
                int number_2 = number_3 - a[j];
                int left = j + 1;
                int right = a.length - 1;
                while (left < right) {
                    int twoSum = a[left] + a[right];
                    if (twoSum < number_2)
                        left++;
                    else if (twoSum > number_2)
                        right--;
                    else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(a[i]);
                        quad.add(a[j]);
                        quad.add(a[left]);
                        quad.add(a[right]);
                        result.add(quad);

                        // Processing the duplicates of number 3
                        while (left < right && a[left] == quad.get(2))
                            ++left;
                        // Processing the duplicates of number 4
                        while (left < right && a[right] == quad.get(3))
                            --right;
                    }
                }
                // Processing the duplicates of number 2
                while (j + 1 < a.length && a[j + 1] == a[j])
                    ++j;
            }
            while (i + 1 < a.length && a[i + 1] == a[i])
                ++i;
        }
        return result;
    }
}
