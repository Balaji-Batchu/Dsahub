class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] prev = intervals[0];
        int r = 1, n = intervals.length, index = 0;
        List<int[]> ans = new ArrayList<>();

        for(int i = 1; i < intervals.length; i ++){
            int[] interval = intervals[i];
            if(interval[0] <= prev[1]){
                prev[1] = Math.max(prev[1], interval[1]);
            }
            else{
                ans.add(prev);
                prev = interval;
            }
        }

        ans.add(prev);

        return ans.toArray(new int[ans.size()][]);
    }
}