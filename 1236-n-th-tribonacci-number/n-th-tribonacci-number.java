class Solution {

    public static int helper(int n, Map<Integer,Integer> map){
        if(n < 2){
            return n;
        }
        else if(n == 2){
            return 1;
        }

        if (map.getOrDefault(n, 0) == 0){
            int res = helper(n - 1, map) + helper(n - 2, map) + helper(n - 3, map);
            map.put(n, res);
            return res;
        }

        else{
            return map.get(n);
        }
    }

    public int tribonacci(int n) {
        Map<Integer, Integer> a = new HashMap<>();
        return helper(n, a);
    }
}