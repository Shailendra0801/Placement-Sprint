class Solution {
    private int getSum(int k){
        int a = k;
        int ans = 0;
        while(a > 0){
            ans += a%10;
            a /= 10;
        }
        return ans;
    }
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = getSum(nums[i]);
        }
        Arrays.sort(nums);

        return nums[0];
    }
}