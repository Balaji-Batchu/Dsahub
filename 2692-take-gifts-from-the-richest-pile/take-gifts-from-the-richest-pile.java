class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int x: gifts) maxheap.add(x);

        while(k > 0){
            int maxi = maxheap.poll();
            int sqrt = (int) Math.sqrt(maxi);
            maxheap.add(sqrt);
            k --;
        }

        long ans = 0;
        while(!maxheap.isEmpty()){
            ans += maxheap.poll();
        }

        return ans;
    }
}