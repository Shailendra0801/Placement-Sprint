class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        int s= 0;
        int e= n-1;
        int ans = Integer.MAX_VALUE;
        while(s <= e){
            int mid= s + (e - s) / 2;
            if(nums[mid] > nums[e]){ 
                s= mid+1;
            }
            else if(nums[mid] <= nums[e]){ 
                ans= Math.min(ans, nums[mid]);
                e= mid-1;
            }
        }
        return ans;
    }
}