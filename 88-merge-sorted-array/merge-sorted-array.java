class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int i = 0, j = 0, current = 0;
        int[] dummy = Arrays.copyOf(nums1, nums1.length);

        while(i < n || j < m){
            int left = i < n ? dummy[i] : Integer.MAX_VALUE;
            int right = j < m ? nums2[j] : Integer.MAX_VALUE;

            if(left <= right){
                nums1[current] = left;
                i ++;
            }
            else{
                nums1[current] = right;
                j ++;
            }

            current ++;
        }
    }
}