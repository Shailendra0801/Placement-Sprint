class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = 1;
        }
        for(int i = 0, p = 1; i < nums.length; i++){
            ans[i] *= p;
            p *= nums[i];
        }
        for(int i = nums.length-1, p = 1; i >= 0; i--){
            ans[i] *= p;
            p *= nums[i];
        }
        return ans;
    }
}