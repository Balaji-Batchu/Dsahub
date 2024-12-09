class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int n = intervals.length, i = 0;

        while(i < n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i ++;
        }

        while(i < n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i ++;
        }
        ans.add(newInterval);

        while(i < n){
            ans.add(intervals[i]);
            i ++;
        }

        // System.out.println(ans.get(1));
        int[][] res = new int[ans.size()][2];
        for(int x = 0; x < ans.size(); x ++){
            res[x] = ans.get(x);
        }

        return res;
    }
}