class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int left = 0, n = s.length(), right = n - 1;
        while(left < right) {
            while(left < right && !(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)))) {
                left ++;
            }

            while(right > left && !(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)))) {
                right --;
            }

            if(left < right && (s.charAt(left) != s.charAt(right))) return false;

            left ++;
            right --;

        }

        return true;
    }
}