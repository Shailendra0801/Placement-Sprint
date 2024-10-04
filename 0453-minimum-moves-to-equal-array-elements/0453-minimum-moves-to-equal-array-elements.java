class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
           int sum = -1*(nums[0] - nums[i]);
           ans += sum;
        }
        return ans;
    }
}