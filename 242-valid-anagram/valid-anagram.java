class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for(char c: s.toCharArray()) {
            arr[c - 'a'] ++;
        }

        for(char c: t.toCharArray()) {
            if(arr[c - 'a'] == 0) return false;
            arr[c - 'a'] --;
        }

        for(int x: arr) {
            if(x != 0) return false;
        }
        
        return true;
    }
}