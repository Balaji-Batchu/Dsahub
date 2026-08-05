class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;

        while(left < right) {
            int i = height[left], j = height[right];
            maxArea = Math.max((Math.min(i, j) * (right - left)), maxArea);

            if(i < j) left ++;
            else right --;
        }

        return maxArea;
    }
}