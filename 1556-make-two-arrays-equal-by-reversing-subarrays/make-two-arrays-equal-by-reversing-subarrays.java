class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int temp = 0;
        for(int x: target){
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }

        for(int y: arr){
            if(hmap.containsKey(y) && hmap.get(y) > 0){
                temp = hmap.get(y);
                if(temp == 1) hmap.remove(y);
                else hmap.put(y, hmap.get(y) - 1);
            }
            else{
                return false;
            }
        }

        return hmap.size() == 0 ? true : false;
    }
}