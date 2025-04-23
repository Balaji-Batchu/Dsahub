class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for(int weight: weights){
            left = Math.max(left, weight);
            right += weight;
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if(canClearContainers(weights, mid, days)){
                right = mid;
            }
            else left = mid + 1;
        }

        return left;
    }

    public static boolean canClearContainers(int[] weights, int capacity, int D){
        int days = 1, currentWeight = 0;

        for(int weight: weights){
            if(currentWeight + weight > capacity){
                days ++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }

        return days <= D;
    }
}