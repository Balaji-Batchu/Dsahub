class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 1;
        int n = searchWord.length();
        int left = 0;
        
        String[] tmp = sentence.split(" ");

        for(String s: tmp){
            int m = s.length();
            if(m >= n){
                if(s.substring(0, n).equals(searchWord)) return index;
            }
            index += 1;
        }

        return -1;
    }
}