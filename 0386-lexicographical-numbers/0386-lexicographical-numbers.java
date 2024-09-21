class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int x = 1;
        for(int i = 0; i < n; i++){
            ans.add(x);
            if(x*10 <= n)
                x *= 10;
            else{
                while(x%10 == 9 || x+1 > n){
                    x /= 10;
                }
                x++;
            }
            
        }
        return ans;
    }
}