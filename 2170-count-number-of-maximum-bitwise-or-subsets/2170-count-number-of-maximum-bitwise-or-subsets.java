class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for(int i = 0; i < nums.length; i++){
            maxOr |= nums[i];
        }

        return getCount(nums, 0, 0, maxOr);
    }
    private int getCount(int[] arr, int i, int currOr, int maxOr){
        if(i == arr.length){
            return currOr == maxOr ? 1 : 0;
        }
        int inc = getCount(arr, i+1, currOr | arr[i], maxOr);
        int exc = getCount(arr, i+1, currOr, maxOr);

        return inc + exc;
    }
}