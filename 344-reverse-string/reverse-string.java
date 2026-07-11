class Solution {
    public void reverseString(char[] s) {
        int arrSize = s.length;
        int left = 0;
        int right = arrSize - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }
}