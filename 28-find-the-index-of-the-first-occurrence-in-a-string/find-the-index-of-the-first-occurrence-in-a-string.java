class Solution {
    public int strStr(String haystack, String needle) {
        int le = needle.length();
        for(int x = 0; x <= haystack.length() - le; x++){
            if(haystack.substring(x, x+le).equals(needle)){
                return x;
            }
        }
        return -1;
    }
}