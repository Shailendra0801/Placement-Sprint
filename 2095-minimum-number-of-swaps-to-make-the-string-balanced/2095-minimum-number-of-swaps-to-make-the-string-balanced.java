class Solution {
    public int minSwaps(String s) {
        // int n = s.length();
        // int bal = 0, ans = 0;

        // for(int i = 0; i < n; i++){
        //     if(s.charAt(i) == '[')
        //         bal++;
        //     else
        //         bal--;
            
        //     if(bal < 0){
        //         ans++;
        //         bal = 1;
        //     }
        // }

        // return ans;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '[')
                stack.push(ch);
            else{
                if(stack.isEmpty() || stack.peek() == ']')
                    stack.push(ch);
                else
                    stack.pop();
            }
        }
        return ((stack.size()/2)+1)/2;
    }
}