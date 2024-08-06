class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char x: word.toCharArray()){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        List<Integer> s = freq.values().stream().sorted(Comparator.reverseOrder())
                                                                    .collect(Collectors.toList());


        int mul = 1;
        int mini = 0;
        for(int i = 0; i < s.size(); i ++){
            if(i > 0 && i % 8 == 0) mul ++;
            mini += mul * s.get(i);
        }

        return mini;
    }
}