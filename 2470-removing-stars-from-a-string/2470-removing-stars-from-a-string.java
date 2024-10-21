class Solution {
    public String removeStars(String s) {
        // Approach 1
        // Stack<Character> stk = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(!stk.isEmpty() && c == '*')
        //         stk.pop();
        //     else
        //         stk.push(c);
        // }
        // StringBuilder ans = new StringBuilder();
        // while(!stk.isEmpty()){
        //     ans.append(stk.pop());
        // }

        // return ans.reverse().toString();

        // Approach 2
        char[] ans = s.toCharArray();
        int i = -1;
        for(char c : ans){
            if(i >= 0 && c == '*')
                i--;
            else{
                i++;
                ans[i] = c;
            }
        }
        return String.valueOf(ans, 0, i+1);
    }
}