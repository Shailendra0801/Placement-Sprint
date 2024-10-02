class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int target = 0;
        int ans = 0, ret = 0;
        for(int i = 0; i < n-1; i++){
            ans = Math.max(ans, nums[i]+i);
            if(i == target){
                ret++;
                target = ans;

                if(target >= n-1)
                    break;
            }
        }

        return ret;
    }
}