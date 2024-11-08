class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] res = new int[n];
        int x = 0;
        int val = (1 << maximumBit) - 1;
        int pXor = 0;

        for(int num : nums)
            pXor ^= num;
        
        for(int i = 0; i < n; i++){
            res[i] = pXor^val;
            pXor ^= nums[n-1-i];
        }

        return res;
    }
}