class Solution {
    public int firstMissingPositive(int[] nums) {
        int start = 1;
        Set<Integer> dups = new HashSet<>(Arrays.stream(nums).boxed().toList());
        nums = dups.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(nums);
        for(int x: nums){
            if(x > 0){
                if(x != start){
                    return start;
                }
                else{
                    start++;
                }
            }
        }
        return start++;
    }
}