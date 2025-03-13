class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, m = queries.length;
        int[] lineSweep = new int[n + 1];

        for(int[] qry: queries){
            int l = qry[0], r = qry[1];
            lineSweep[l] += 1;
            lineSweep[r + 1] -= 1;
        }

        for(int i = 1; i < n; i ++){
            lineSweep[i] += lineSweep[i - 1];
        }

        for(int x = 0; x < n; x ++){
            if(lineSweep[x] < nums[x]) return false;
        }

        return true;
    }
}