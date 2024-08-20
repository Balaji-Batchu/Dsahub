class Solution {
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> st = new Stack<>();

        s = s.trim();
        int end = s.length() - 1;
        int prev = 0;
        while(end >= 0){
            if(s.charAt(end) == ' '){
                while(!st.isEmpty() && !st.isEmpty()){
                    ans.append(st.pop());
                    if(st.isEmpty()) ans.append(' '); 
                }
            }

            else{
                System.out.println("char is : " + s.charAt(end));
                st.push(s.charAt(end));
            }

            end --;
        }
        
        while(!st.isEmpty()){
          ans.append(st.pop());
        }

        return ans.toString();
    }
}