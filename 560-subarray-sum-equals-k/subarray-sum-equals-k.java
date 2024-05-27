class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> prevSums = new HashMap<>();
        int sum = 0;

        prevSums.put(0,1);
        for(int x: nums){
            sum += x;

            if(prevSums.containsKey(sum - k)) count = count + prevSums.get(sum - k);
            
            prevSums.put(sum, prevSums.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}