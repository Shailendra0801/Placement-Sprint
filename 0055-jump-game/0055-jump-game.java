class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        int x = n-1;
        for(int i = n; i >= 0; i--){
            if(i + nums[i] >= x)
                x = i;
        }
        return x == 0;
    }
}