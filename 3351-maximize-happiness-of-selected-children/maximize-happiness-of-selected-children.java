class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int j = 0;
        long res = 0;

        for(int i = n - 1; i >= n - k; --i){
            res += Math.max(0, happiness[i] - j++);
        }
        return res;
    }
}