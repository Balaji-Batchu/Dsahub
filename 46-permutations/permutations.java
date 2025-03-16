class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        boolean[] flag = new boolean[n];
        List<Integer> temp = new ArrayList<>();

        allPermutations(ans, temp, nums, flag);

        return ans;
    }

    public static void allPermutations(List<List<Integer>> ans, List<Integer> temp, int[] nums, boolean[] flag){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int i = 0; i < nums.length; i ++){
            if(!flag[i]){
                flag[i] = true;
                temp.add(nums[i]);
                allPermutations(ans, temp, nums, flag);
                temp.remove((Integer) nums[i]);
                flag[i] = false;
            }
        }
    }
}