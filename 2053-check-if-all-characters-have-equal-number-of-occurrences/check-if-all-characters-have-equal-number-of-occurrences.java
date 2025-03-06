class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] chars = new int[27];

        for(char x: s.toCharArray()){
            chars[x - 'a'] += 1;
        }

        int z = 0, count = 0;
        while(chars[z] == 0){
            z ++;
        }
        count = chars[z];

        for(int x: chars){
            if(x != 0 && x != count) return false;
        }

        return true;
    }
}