import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRow = 5;
        List<List<Integer>> ansList = pascalTriangle(numRow);
        for (List<Integer> outerValue : ansList) {
            for (Integer innervalue : outerValue) {
                System.out.print(innervalue + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> pascalTriangle(int numRow) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row, previous = null;
        for (int i = 0; i < numRow; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(previous.get(j - 1) + previous.get(j));
            previous = row;
            result.add(row);
        }
        return result;
    }
}
