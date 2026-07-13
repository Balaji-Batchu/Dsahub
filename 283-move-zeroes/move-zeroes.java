class Solution {
    public void moveZeroes(int[] arr) {
        int left = 0, right = 0, count = 0, n = arr.length;
        while(right < n) {
            if(arr[right] != 0) {
                arr[left] = arr[right];
                left ++;
            } else {
                count ++;
            }
            right ++;
        }

        while(count > 0) {
            arr[left] = 0;
            count --;
            left ++;
        }
    }
}