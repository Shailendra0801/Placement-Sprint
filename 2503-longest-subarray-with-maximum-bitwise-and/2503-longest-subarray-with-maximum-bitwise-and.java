class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, ans = 0, len = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                ans++;
            }
            else
                ans = 0;
            
            len = Math.max(len,ans);
        }

        return len;
    }
}