class Solution {
    public int findClosestNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(Math.abs(ans) > Math.abs(nums[i])){
                ans = nums[i];
            }
            if(Math.abs(ans) == Math.abs(nums[i])){
                ans = ans > nums[i]? ans: nums[i];
            }
        }
        return ans;
    }
}