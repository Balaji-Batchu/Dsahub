class Solution {
    public int numTeams(int[] rating) {
        int ans = 0;
        int len = rating.length;
        for(int i = 1; i <= len - 1; i ++){
            int mid = rating[i];
            int minl = 0;
            int maxl = 0;
            int minr = 0;
            int maxr = 0;
            for(int x = 0; x < i; x ++){
                if(rating[x] < mid) minl ++;
            }
            maxl = i - minl;
            for (int y = i + 1; y < rating.length; y ++){
                if(rating[y] > mid) maxr ++;
            }
            minr = len - i - 1 - maxr;
            ans += minl * maxr;
            ans += maxl * minr;
        }
        return ans;
    }
}