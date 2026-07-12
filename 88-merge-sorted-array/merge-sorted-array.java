class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = nums1.length - 1;
        int p1 = m - 1, p2 = n - 1;
        while(p1 >= 0 && p2 >= 0) {
            System.out.println("p1: " + pointer);
            if(nums2[p2] >= nums1[p1]) {
                nums1[pointer] = nums2[p2];
                p2 --;
            } else {
                nums1[pointer] = nums1[p1];
                p1 --;
            }
            pointer --;
            System.out.println("p1: " + p1 + ", p2: " + p2);
        }

        while(p1 >= 0) {
            nums1[pointer] = nums1[p1];
            pointer --;
            p1 --;
        }

        while(p2 >= 0) {
            nums1[pointer] = nums2[p2];
            pointer --;
            p2 --;
        }
    }
}