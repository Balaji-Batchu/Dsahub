class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x: arr1) hm.put(x, hm.getOrDefault(x, 0) + 1);
        int[] ans = new int[arr1.length];
        int index = 0;
        for(int x: arr2){
            int n = hm.get(x);
            while(n > 0){
                ans[index] = x;
                n --;
                index ++;
            }
            hm.put(x,   0);
        }
        int[] rem = new int[arr1.length - index];
        int i2 = 0;
        for(Map.Entry<Integer, Integer> temp : hm.entrySet()){
            int x = temp.getKey();
            int n = temp.getValue();
            while(n > 0){
                rem[i2] = x;
                n --;
                i2 ++;
            }
            hm.put(x, 0);
        }
        Arrays.sort(rem);
        for(int x: rem){
            ans[index] = x;
            index ++;
        }
        return ans;
    }
}