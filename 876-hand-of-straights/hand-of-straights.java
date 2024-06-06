class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for(int x: hand) freq.put(x, freq.getOrDefault(x, 0) + 1);
        for(int i: freq.keySet()){
            if(freq.get(i) > 0){
                for(int j = groupSize - 1; j >= 0; --j){
                    if(freq.getOrDefault(i + j, 0) < freq.get(i)) return false;
                    freq.put(i + j, freq.get(i + j) - freq.get(i));
                }
            }
        }
        return true;
    }
}