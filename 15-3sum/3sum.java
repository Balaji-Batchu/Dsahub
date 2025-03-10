class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int x = 0; x < n - 2; x ++){
            if(x > 0 && nums[x] == nums[x - 1])
                continue;
            
            int l = x + 1, r = n - 1;
            while(l < r){
                int sum = nums[x] + nums[l] + nums[r];
                if(sum < 0) 
                    l ++;
                
                else if(sum > 0)
                    r --;

                else{
                    ans.add(Arrays.asList(nums[x], nums[l], nums[r]));
                    l ++;
                    while(l < r && nums[l] == nums[l - 1])
                        l ++;
                    r --;
                    while(l < r && nums[r] == nums[r + 1])
                        r --;
                }
            }
        }

        return ans;
    }
}