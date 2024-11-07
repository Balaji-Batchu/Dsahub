class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        int n = intervals.length;
        int[] prevInterval = intervals[0];

        for(int x = 1; x < n; x ++){
            int[] currentInterval = intervals[x];

            if(currentInterval[0] <= prevInterval[1]){
                prevInterval[1] = Math.max(currentInterval[1], prevInterval[1]);
            }
            else{
                ans.add(prevInterval);
                prevInterval = currentInterval;
            }
        }

        ans.add(prevInterval);

        return ans.toArray(new int[ans.size()][]);
    }
}