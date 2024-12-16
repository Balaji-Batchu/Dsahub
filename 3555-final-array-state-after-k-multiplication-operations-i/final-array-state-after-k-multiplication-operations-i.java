class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(new Comparator<Integer[]>(){
            
            public int compare(Integer[] a, Integer[] b){
                int firstCompare = Integer.compare(a[0], b[0]);

                if(firstCompare != 0) return firstCompare;
                else return Integer.compare(a[1], b[1]);
            }
        });

        for(int x = 0; x < nums.length; x ++){
            pq.add(new Integer[]{nums[x], x});
        }

        for(int y = 0; y < k; y ++){
            Integer[] temp = pq.poll();
            pq.add(new Integer[]{temp[0] * multiplier, temp[1]});
        }

        int[] ans = new int[nums.length];
        while(! pq.isEmpty()){
            Integer[] temp = pq.poll();
            ans[temp[1]] = temp[0];
        }

        return ans;
    }
}