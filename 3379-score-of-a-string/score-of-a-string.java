class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int j = 1;
        int ans = 0;
        while(j < s.length()){
            ans += Math.abs((int) s.charAt(i) - (int) s.charAt(j));
            i ++;
            j ++;
        }
        return ans;
    }
}