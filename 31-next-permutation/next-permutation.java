class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, index = -1;
        for(int x = n - 2; x >= 0; x --){
            if(nums[x] < nums[x + 1]){
                index = x;
                break;
            }
        }

        

        if(index != -1){
            for(int x = n - 1; x > index; x --){
                if(nums[x] > nums[index]){
                    swap(nums, index, x);
                    break;
                }
            }
            reverse(nums, index + 1, n - 1);
        }
        else{
            reverse(nums, 0, n - 1);
        }
        

    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i ++;
            j --; 
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}