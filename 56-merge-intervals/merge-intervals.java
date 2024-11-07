class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        Stack<int[]> stack = new Stack<>();
        int n = intervals.length;
        stack.push(intervals[0]);
        for(int x = 1; x < n; x ++){
            if(intervals[x][0] <= stack.peek()[1]){
                int[] temp = stack.pop();
                int[] merged = new int[]{Math.min(intervals[x][0], temp[0]), 
                                            Math.max(intervals[x][1], temp[1])};

                stack.push(merged);
            }
            else{
                stack.push(intervals[x]);
            }
        }

        int s = stack.size();
        int [][] res = new int[s][2];
        for(int x = 0; x < s; x ++){
            res[x] = stack.pop();
        }

        return res;
    }
}