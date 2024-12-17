class Solution {
    public int findJudge(int n, int[][] trust) {

        if(trust.length == 0 && n > 1) return -1;
        if(trust.length == 0 && n == 1) return 1;

        int[] trustCount = new int[n + 1];
        HashSet<Integer> nrml = new HashSet<>();
        int m = trust.length;

        for(int x = 0; x < m; x ++){
            trustCount[trust[x][1]] ++;
            nrml.add(trust[x][0]);
        }

        for(int x = 0; x <= n; x ++) if(trustCount[x] >= (n - 1) 
                                            && !nrml.contains(x)) return x;

        return -1;
    }
}