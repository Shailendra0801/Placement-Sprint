class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && ch == stk.peek())
                stk.pop();
            else
                stk.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }

        return ans.reverse().toString();
        
    }
}