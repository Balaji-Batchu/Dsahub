class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        Set<Integer> zrs = new HashSet<>();
        Set<Integer> zcs = new HashSet<>();

        for(int x = 0; x < rows; x ++){
            for(int y = 0; y < cols; y ++){
                if(matrix[x][y] == 0){
                    zrs.add(x);
                    zcs.add(y);
                }
            }
        }

        for(int r: zrs){
            for(int col = 0; col < cols; col ++){
                matrix[r][col] = 0;
            }
        }

        for(int c: zcs){
            for(int row = 0; row < rows; row ++){
                matrix[row][c] = 0;
            }
        }
    }
}