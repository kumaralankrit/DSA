public class FindTheRowWithMaxNoOf1sMatrix {
    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(mat));
    }

    private static int rowWithMax1s(int[][] mat) {
        int col = mat.length - 1;
        int row = 0;
        //Traversing row by row
        for (int i = 0; i < mat.length; i++) {
            //last column to first
            for (int j = col; j >= 0; j--) {
                if (mat[i][j] == 1) {
                    row = i;
                    //We will not see same column again
                    col--;
                } else {    // if we see zero than skip that row
                    break;
                }
            }
        }
        return row;
    }

}
