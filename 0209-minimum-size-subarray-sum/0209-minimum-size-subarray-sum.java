class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= t){
                ans = Math.min(ans, i - start +1);
                sum -= nums[start++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}