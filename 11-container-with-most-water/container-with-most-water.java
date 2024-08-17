class Solution {
    public int maxArea(int[] height) {
        int maxi = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            maxi = Math.max(maxi, (right - left) * Math.min(height[left], height[right]));
            if(height[left] <= height[right]) left ++;
            else right --;
        }

        return maxi;
    }
}