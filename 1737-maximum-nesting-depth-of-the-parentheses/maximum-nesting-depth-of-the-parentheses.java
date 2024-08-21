class Solution {
    public int maxDepth(String s) {
        int max_depth = 0;
        int temp = 0;

        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '(') temp ++;
            max_depth = Math.max(max_depth, temp);
            if(s.charAt(i) == ')') temp --;
        }

        return max_depth;
    }
}