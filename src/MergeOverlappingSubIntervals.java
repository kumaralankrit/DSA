import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingSubIntervals {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 4}, {2, 6}, {8, 9}, {8, 10}, {9, 11}, {15, 18}, {16, 17}};
        int res[][] = merge(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    private static int[][] merge(int[][] arr) {
        List<int[]> result = new ArrayList<>();
        if (arr == null || arr.length == 0)
            return result.toArray(new int[0][]);
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        int start = arr[0][0];
        int end = arr[0][1];
        for (int[] i : arr) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }
}
