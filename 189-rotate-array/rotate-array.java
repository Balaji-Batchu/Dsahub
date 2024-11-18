class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }

    static void reverse(int[] a, int start, int end){
        int l = start;
        int r = end - 1;

        while(l < r){
            int temp = a[r];
            a[r] = a[l];
            a[l] = temp;

            l ++;
            r --;
        }
    }
}