class Solution {

    public static int helper(int n, Map<Integer,Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }

        int result;
        if(n < 2){
            return n;
        }
        else if(n == 2){
            return 1;
        }
        else{
            result = helper(n - 1, map) + helper(n - 2, map) + helper(n - 3, map);
        }
            map.put(n, result);
            return result;
    }

    public int tribonacci(int n) {
        Map<Integer, Integer> a = new HashMap<>();
        return helper(n, a);
    }
}