class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println("Nums sorted: " + Arrays.toString(nums));
        int n = nums.length, i = 0;
        List<List<Integer>> ans = new ArrayList<>();
        while(i < n - 2) {
            while(i > 0 && i < n && nums[i - 1] == nums[i]){
                i ++;
            }
            System.out.println("unique I's at: " + i);

            int left = i + 1;
            int right = n - 1;
            System.out.println("Left: " + left + " Right: " + right);

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);

                    left ++;
                    right --;

                    while(left < right && nums[left - 1] == nums[left]) left ++;

                    while(left < right && nums[right + 1] == nums[right]) right --;

                } else if(sum > 0) right --;
                else left ++;
            }
            i ++;
        }

        return ans;
    }
}