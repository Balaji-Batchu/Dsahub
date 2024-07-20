class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rl = rowSum.length;
        int cl = colSum.length;
        int[][] res = new int[rl][cl];
        int mini;

        for(int i = 0; i < rl; i ++){
            for (int j = 0; j < cl; j ++){
                mini = Math.min(rowSum[i], colSum[j]);
                res[i][j] = mini;
                rowSum[i] -= mini;
                colSum[j] -= mini;
            }
        }

        return res;
    }
}