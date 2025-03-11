class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length(), count = 0, l = 0;

        for(int r = 0; r < n; r ++){
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);
            
            while(hm.size() == 3){
                count += n - r;
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                if(hm.get(s.charAt(l)) == 0) hm.remove(s.charAt(l));
                l ++;
            }

        }

        return count;
    }
}