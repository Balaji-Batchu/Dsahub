class Solution {
    public boolean isSubsequence(String s, String t) {
        int matchingIndex = 0;
        for(char x: t.toCharArray()){
            if(matchingIndex < s.length() && s.charAt(matchingIndex) == x){
                matchingIndex += 1;
            }
        }

        return matchingIndex == s.length() ? true : false;
    }
}