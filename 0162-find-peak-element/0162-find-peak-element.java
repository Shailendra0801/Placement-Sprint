class Solution {
    public int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length-1);
    }

    private int search(int[] arr, int low, int high){
        if(low == high)
            return low;
        int mid = low + (high - low)/2;
        if(arr[mid] < arr[mid+1])
            return search(arr, mid+1, high);
        else
            return search(arr, low, mid);
    }
}