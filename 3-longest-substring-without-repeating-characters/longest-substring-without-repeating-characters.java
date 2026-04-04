class Solution {
    public int lengthOfLongestSubstring(String a) {
        int n = a.length();
        int left = 0;
        int maxLength = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int right = 0; right < n; right ++){
            if(map.containsKey(a.charAt(right))  && left <= map.get(a.charAt(right))) {
                left = map.get(a.charAt(right)) + 1;
                // System.out.println("duplicate found: " + a.charAt(right));
            }
            
            map.put(a.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}