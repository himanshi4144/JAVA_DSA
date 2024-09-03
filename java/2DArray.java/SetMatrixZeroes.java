
public class SetMatrixZeroes {
    static int setMatrixZeroes(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = matrix[i][j] * 0;

                }

            }
        }
        return 0;

    }

    public static void main(String[] args) {
        // int [][] arr=new int[3][3];
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println(setMatrixZeroes(matrix));
    }

}
