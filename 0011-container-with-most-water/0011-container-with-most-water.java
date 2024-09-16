class Solution {
    private int maxx(int a, int b){
        return (a>b)?a:b;
    }
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i != j){
            if(height[i] <= height[j]){
                ans = maxx(ans, ((j-i)*height[i]));
                i++;
            }
            else if(height[i] > height[j]){
                ans = maxx(ans, ((j-i)*height[j]));
                j--;
            }
            
        }
        return ans;
    }
}