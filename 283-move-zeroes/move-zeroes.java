class Solution {
    public void moveZeroes(int[] arr) {
        int left = 0, right = 0, n = arr.length;
        while(right < n) {
            if(arr[right] != 0) {
                arr[left] = arr[right];
                left ++;
            }
            right ++;
        }

        while(left < n) {
            arr[left] = 0;
            left ++;
        }
    }
}