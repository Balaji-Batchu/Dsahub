class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;

        while(left < right) {
            int i = height[left], j = height[right], minLength = Math.min(i, j);
            maxArea = Math.max((minLength * (right - left)), maxArea);

            while(left < right && height[left] <= minLength) left ++;
            while(left < right && height[right] <= minLength) right --;
        }

        return maxArea;
    }
}