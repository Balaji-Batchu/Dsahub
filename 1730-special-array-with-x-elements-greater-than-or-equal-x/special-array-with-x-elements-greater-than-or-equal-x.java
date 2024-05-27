class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> counts = new HashMap<>();

        for(int x = 0; x <= n; x ++){
            for(int y : nums){
                if(y >= x){
                    counts.put(x,counts.getOrDefault(x, 0) + 1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> temp : counts.entrySet()){
            if(temp.getKey() == temp.getValue()) return temp.getKey();
        }
        return -1;
    }
}