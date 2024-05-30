class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> visited = new HashMap<>();
        int maxi = 0;
        int l = 0;
        int temp = 0;
        for(int i = 0; i < s.length(); i ++){
            char curr = s.charAt(i);
            if(!visited.containsKey(curr)){
                visited.put(curr,i);
            }
            else if(visited.containsKey(curr)){
                if(visited.get(curr) >= l){
                    l = visited.get(curr) + 1;
                }
                visited.put(curr, i);
            }
            maxi = Math.max(maxi, i - l + 1);
        }
        return maxi;
    }
}