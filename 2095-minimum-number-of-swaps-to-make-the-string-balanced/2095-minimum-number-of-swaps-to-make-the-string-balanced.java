class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int bal = 0, ans = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '[')
                bal++;
            else
                bal--;
            
            if(bal < 0){
                ans++;
                bal = 1;
            }
        }

        return ans;

       
    }
}