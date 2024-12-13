class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        long ans = 0;
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(Comparator
                .comparingInt((Integer[] a) -> a[0]).thenComparing((Integer[] b) -> b[1]));

        HashSet<Integer> markedIndexes = new HashSet<>();
        for(int x = 0; x < n; x ++){
            pq.add(new Integer[]{nums[x], x});
        }

        while(markedIndexes.size() != n){
            Integer[] temp = pq.poll();
            int index = temp[1];
            if(! markedIndexes.contains(index)){
                if((index - 1) >= 0) markedIndexes.add(index - 1);
                if((index + 1) < n) markedIndexes.add(index + 1);
                markedIndexes.add(index);

                ans += temp[0];
            }
        }

        return ans;
    }
}