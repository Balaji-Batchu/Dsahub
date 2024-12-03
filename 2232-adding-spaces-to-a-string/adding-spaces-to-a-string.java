class Solution {
    public String addSpaces(String txt, int[] spaces) {
      StringBuilder ans = new StringBuilder("");
      int prev = 0;
      
      for(int next: spaces){
        String word = txt.substring(prev, next);
        ans.append(word);
        ans.append(" ");
        prev = next;
      }
      
      ans.append(txt.substring(prev, txt.length()));
      return ans.toString();
    }
}