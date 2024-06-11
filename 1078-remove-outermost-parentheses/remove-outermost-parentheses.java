class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(char x : s.toCharArray()){
            if(x == '('){
                stack.add('(');
                count ++;

                if(count > 1){
                    ans.append("(");
                }
            }

            else{
                if(stack.size() > 1){
                    ans.append(")");
                }
                stack.pop();
                count --;
            }
        }

        return ans.toString();
    }
}