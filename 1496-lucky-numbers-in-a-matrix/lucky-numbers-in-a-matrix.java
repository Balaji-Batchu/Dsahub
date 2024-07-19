class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int row_min_max = Integer.MIN_VALUE;
        int col_max;
        int row_min;
        for(int i = 0; i < matrix.length; i ++){
            row_min = matrix[i][0];
            for(int j = 0; j < matrix[0].length; j ++){
                row_min = Math.min(row_min, matrix[i][j]);
            }
            row_min_max = Math.max(row_min_max, row_min);
        }

        for(int i = 0; i < matrix[0].length; i ++){
            col_max = matrix[0][i];
            for(int j = 0; j < matrix.length; j ++){
                col_max = Math.max(col_max, matrix[j][i]);
            }
            if(col_max == row_min_max) return new ArrayList<Integer>(Arrays.asList(row_min_max));
        }

        return new ArrayList<Integer>();
    }
}