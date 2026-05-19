class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int left = 0, right = 0, n1 = nums1.length, n2 = nums2.length;

        while(left < n1 && right < n2) {
            if (nums1[left] == nums2[right]) {
                return nums1[left];
            } else if(nums1[left] < nums2[right]) left ++;
            else right ++;
        }
        return -1;
    }
}