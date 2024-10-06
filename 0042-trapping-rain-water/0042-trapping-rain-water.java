class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int lMax = 0;
        int rMax = 0;
        int waterTrapped = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= lMax)
                    lMax = height[left];
                else
                    waterTrapped += lMax - height[left];
                
                left++;
            }
            else{
                if(height[right] >= rMax)
                    rMax = height[right];
                else
                    waterTrapped += rMax - height[right];
                
                right--;
            }
        }
        return waterTrapped;
    }
}