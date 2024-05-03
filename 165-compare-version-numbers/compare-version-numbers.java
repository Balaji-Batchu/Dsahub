class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int maxiLength = Math.max(v1.length, v2.length);
        for(int x = 0; x < maxiLength; x++){
            int a = x < v1.length ? Integer.valueOf(v1[x]) : 0;
            int b = x < v2.length ? Integer.valueOf(v2[x]) : 0;

            if(a < b) return -1;

            if(a > b) return 1;
        }
        return 0;
    }
}