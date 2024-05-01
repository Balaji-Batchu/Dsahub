class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        int start = 0;
        while(start < word.length()){
            if(word.charAt(start) == ch){
                res.append(word.charAt(start));
                res.reverse();
                start ++;
                break;
            }
            else{
                res.append(word.charAt(start));
                start ++;
            }
        }

        while(start < word.length()){
            res.append(word.charAt(start));
            start ++;
        }
        return res.toString();
    }
}