class Solution {
    public int maxOperations(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= k)
                nums[i] = 0;
        }
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        int ans = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k){
                ans++;
                i++;
                j--;
            }
            else if(sum > k)
                j--;
            else
                i++;
        }
        return ans;
    }
}