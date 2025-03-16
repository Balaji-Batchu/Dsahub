class Solution {
    public void rotate(int[][] matrix) {
        // Transpose of matrix;
        int n = matrix.length;
        for(int x = 0; x < n; x ++){
            for(int y = x + 1; y < n; y ++){
                swap(matrix, x, y);
            }
        }

        // Reverse
        for(int x = 0; x < n; x ++){
            for(int y = 0; y < n/2; y ++){
                reverse(matrix, x, y);
            }
        }
    }


    public static void swap(int[][] matrix, int x, int y){
        int temp = matrix[x][y];
        matrix[x][y] = matrix[y][x];
        matrix[y][x] = temp;
    }

    public static void reverse(int[][] matrix, int x, int y){
        int temp = matrix[x][y], n = matrix.length;
        matrix[x][y] = matrix[x][(n - 1) - y];
        matrix[x][(n - 1) - y] = temp;
    }
}